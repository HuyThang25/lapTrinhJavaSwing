import org.omg.PortableServer.IdAssignmentPolicy;

public class Book{
    private int id;
    private String name;
    private Double price;
    
    public Book(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Book() {
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("%5d %-45s %10.2f" ,this.id,this.name,this.price);
    }

    

}