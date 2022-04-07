/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTCPSampleProgram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Client {
    public static void main(String[] args) throws IOException{
        Socket sk = new Socket("localhost",5555);
        System.out.println("Connected with server");
        DataInputStream dis = new DataInputStream(sk.getInputStream());
        DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
        
        while(true){
            System.out.print("You: ");
            dos.writeUTF(new Scanner(System.in).nextLine());
            System.out.println("Server: "+dis.readUTF());
        }
    }
    
}
