/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ASUS TUF
 */
public class JavaSwing {

    /**
     */

    public static ArrayList<User> listUser = new ArrayList<>();
    public static void saveInfo() throws IOException{
        File f = new File("D:\\NetBeans\\JavaSwing\\src\\javaswing\\PasswordFile.txt");
        try (FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw)) {
            
            for (User x: listUser){
                bw.write(x.toString());
                bw.newLine();
            }
            
        }
    }
    public static void readInfo() throws FileNotFoundException, IOException{
        File f = new File("D:\\NetBeans\\JavaSwing\\src\\javaswing\\PasswordFile.txt");
        try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
            
            String str;
            while ((str= br.readLine())!=null){
                String info[] = str.split(",");
                String user =info[0];
                String password = info[1];
                int  salt=Integer.parseInt(info[2]);
                boolean isMale = info[3].equals("true");
                String address= info[4];
                String job=info[5];
                listUser.add(new User(user,password,salt,isMale,address,job));
            }
            
        }
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        readInfo();
        FormTrangChu fTrangChu= new FormTrangChu();
        fTrangChu.setVisible(true);
        
    }
    
}
