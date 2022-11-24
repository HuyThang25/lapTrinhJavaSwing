import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        this.books = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }
    
    public void loadFromFile() throws FileNotFoundException{
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("books.txt");
            //read characters from FileInputStream and write them
            while(true){
                byte[] bId = new byte[5];
                int eof=fin.read(bId);
                if (eof==-1) break;
                byte[] bName = new byte[45];
                fin.read(bName);
                byte[] bPrice = new byte[13];
                fin.read(bPrice);
                int id = Integer.parseInt(new String(bId).trim());  
                String name = new String(bName).trim(); 
                Double price = Double.parseDouble(new String(bPrice).trim()); 
                this.books.add(new Book(id,name,price));
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void printBooks(ArrayList<Book> books){
        if (books.isEmpty()){
             System.out.println("(empty)");
        }
        else{
            System.out.println(String.format("%-5s %-45s %-10s","ID","Name","Price"));
            for (Book b:books){
                System.out.println(b.toString());
            }
        }
    }
    public boolean add(Book book){
        this.books.add(book);
        return true;

    }

    public Book getBookById(int id){
        for(Book b:this.books){
            if (b.getId() == id){
                return b;
            }
        }
        return null;
    }

    public void delete(Book book){
        this.books.remove(book);
    }

    public void sortDescByPrice(){
        Collections.sort(this.books,Comparator.comparingDouble(Book::getPrice));
    }

    public ArrayList<Book> searchByName(String keyword){
        ArrayList<Book> result= new ArrayList<Book>();
        for(Book b:books){
            if (b.getName().contains(keyword)){
                result.add(b);
            }
        }
        return result;
    }

    public void saveToFile() throws IOException{
        FileWriter myfile = null;
        try {
            myfile = new FileWriter("books.txt");
            for(Book b:this.books){
                myfile.write(String.format("%5d %-45s %10.2f\n", b.getId(),b.getName(),b.getPrice()));
            }
        } finally {
            if (myfile != null){
                myfile.close();
            }
        }
    }
}
