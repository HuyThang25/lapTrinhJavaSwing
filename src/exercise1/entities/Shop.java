/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.entities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Shop {
    ArrayList<Product> products = new ArrayList<>();

    public Shop() {
    }
    
    public void add(Product p){
        products.add(p);
    }
    
    public void display(){
        int stt=1;
        for (Product x: products){
            System.out.println("Item "+stt+":");
            stt++;
            x.showInfo();
        }
    }
    public void inputInfo(){
        Product p= new Product();
        while (true){
            p.inputInfo();
            this.add(p);
            while (true){
                System.out.print("Continue shopping(y/n)? ");
                String tiep;
                tiep = new Scanner(System.in).nextLine();
                if (tiep.equalsIgnoreCase("n")) return; 
                if (tiep.equalsIgnoreCase("y")) break;
            }
        }
    }
}
