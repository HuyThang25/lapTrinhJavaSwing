/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.entities;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Product {
    private String name;
    private float price;
    private int quantity;

    public Product() {
    }
    
    
    
    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return  quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void showInfo(){
        System.out.println("\tThe name of item: "+this.name);
        System.out.printf("\tThe unit price: %.2f\n",this.price);
        System.out.println("\tThe quantity: "+this.quantity);
        System.out.printf("\tThe total price: %.2f\n",this.quantity*this.price);
        
    }
    public void inputInfo(){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the name of the item: ");
        this.name= input.nextLine();
        System.out.print("Enter the unit price: ");
        this.price= input.nextFloat();
        System.out.print("Enter the quantity: ");
        this.quantity= input.nextInt();
    }
}
