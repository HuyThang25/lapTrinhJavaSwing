/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTCPSampleProgram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket sSocket = new ServerSocket(5555);
        System.out.println("Server is up");
        Socket sk= sSocket.accept();
        System.out.println("Connected with Client");
        DataInputStream dis= new DataInputStream(sk.getInputStream());
        DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
        
        while (true){
            System.out.println("Client: "+dis.readUTF());
            System.out.print("You: ");
            dos.writeUTF(new Scanner(System.in).nextLine());
        }
    }
    
}
