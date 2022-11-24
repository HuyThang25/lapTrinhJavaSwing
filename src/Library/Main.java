import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void showMenu(){
        System.out.println("-----------------------------------");
        System.out.println("1. list all books");
        System.out.println("2. add a new book");
        System.out.println("3. edit book");
        System.out.println("4. delete a book");
        System.out.println("5. search books by name");
        System.out.println("6. sort books descending by price"); 
        System.out.println();
        System.out.println("0. save & exit");
        System.out.println("-----------------------------------");
    }   
    public static void main(String[] args) throws IOException {
        BookManager list = new BookManager();
        System.out.println("Loading books...");
        list.loadFromFile();
        while(true){
            showMenu();
            System.out.print("Your option: ");
            String choice = new Scanner(System.in).nextLine();
            Scanner input = new Scanner(System.in);
            switch(choice){
                case "0":{
                    System.out.println("Bye!");
                    list.saveToFile();
                    return;
                }
                case "1":{
                    list.printBooks(list.getBooks());
                    break;
                }
                case "2":{
                    System.out.print("Enter book id: ");
                    int id = input.nextInt();
                    System.out.print("Enter book name: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.print("Enter book price: ");
                    Double price  = input.nextDouble();
                    if (list.getBookById(id)==null){
                        list.add(new Book(id,name,price));
                        System.out.println("Added successfully.");
                    }
                    else {
                        System.out.println("Duplicated ID!");
                    }
                    break;
                }
                case "3":{
                    System.out.print("Enter book id: ");
                    int id = input.nextInt();
                    Book b = list.getBookById(id);
                    if (b==null){
                        System.out.println("Invalid ID!");
                    }
                    else {
                        System.out.print("Enter book name: ");
                        input.nextLine();
                        String name = input.nextLine();
                        System.out.print("Enter book price: ");
                        Double price  = input.nextDouble();
                        b.setId(id);
                        b.setName(name);
                        b.setPrice(price);
                        System.out.println("Updated successfully.");
                    }
                    break;
                }
                case "4":{
                    System.out.print("Enter book id: ");
                    int id = input.nextInt();
                    Book b = list.getBookById(id);
                    if (b==null){
                        System.out.println("Invalid ID!");
                    }
                    else {
                        list.delete(b);
                    }
                    break;
                }
                case "5":{
                    System.out.print("Enter keyword: ");
                    String name = input.nextLine();
                    list.printBooks(list.searchByName(name));
                    break;
                }
                case "6":{    
                    System.out.println("After sorting:");
                    list.sortDescByPrice();
                    list.printBooks(list.getBooks());
                    break;
                }
                default:{
                    System.out.println("Invalid option!");
                    break;
                }
            }
        }
    }
}
