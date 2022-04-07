/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUDPSampleProgram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Client {
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException{
        
        // Xây dựng địa chỉ liên lạc 
        int port=1234;
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramSocket dSocket = new DatagramSocket();
        int portSend=5678;
        InetAddress ipSend = InetAddress.getByName("127.0.0.1");
        while(true){
            // Đóng gói thông tin gửi đi 
            byte[] outData= new byte[1024];
            System.out.print("Client: ");
            String message = new Scanner(System.in).nextLine();
            outData = message.getBytes();
            DatagramPacket outPacket = new DatagramPacket(outData, outData.length, ipSend, portSend);
            // Gửi thông tin
            dSocket.send(outPacket);
            
            // Nhận thông tin
            byte[] inData = new byte[1024];
            DatagramPacket inPacket = new DatagramPacket(inData, inData.length);
            dSocket.receive(inPacket);
            // Phân tích thông tin nhân được
            System.out.println("Server: "+new String(inPacket.getData()).trim());
            
            
        }
        
    
    }
    
}
