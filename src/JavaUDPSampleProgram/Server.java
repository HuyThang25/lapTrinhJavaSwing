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
public class Server {
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException{
        
       // Xây dựng địa chỉ liên lạc
       InetAddress ip = InetAddress.getByName("127.0.0.1");
       int port = 5678;
       DatagramSocket dSocket= new DatagramSocket(port, ip);
       
       while(true){
            // Nhận thông tin 
            byte[] inData = new byte[1024];
            DatagramPacket inPacket = new DatagramPacket(inData, inData.length);
            dSocket.receive(inPacket);
            System.out.println("Client: "+new String(inPacket.getData()).trim());
            // Phân tích thông tin nhận được
            String inMessage = new String(inPacket.getData()).trim();
            String outMessage = "";
            String[] info = inMessage.split(" ");
            if (info.length != 6) outMessage="Sai cu phap do dai";
            else if (!(info[0].equalsIgnoreCase("Chi") && info[1].equalsIgnoreCase("so") && info[2].equalsIgnoreCase("dien") && info[3].equalsIgnoreCase("tieu") && info[4].equalsIgnoreCase("thu:") && Integer.parseInt(info[5])>=0)){
                outMessage="Sai cu phap tu ngu";
            }
            else {
                int dien= Integer.parseInt(info[5]);
                double hoaDon;
                if (dien<=50) hoaDon=  dien*1.7;
                else{
                     dien-=50;
                     hoaDon=50*1.7;
                     if (dien<=50) hoaDon+=dien*2.0;
                     else {
                         dien-=50;
                         hoaDon+=50*2.0+dien*2.5;
                     }
                 }
                outMessage="Hoa don cua ban: "+hoaDon;
             }
            // Đóng gói thông tin gửi đi
            byte[] outData = new byte[1024];
            outData = outMessage.getBytes();
            DatagramPacket outPacket = new DatagramPacket(outData, outData.length, inPacket.getAddress(), inPacket.getPort());
            // Gửi thông tin đi
            dSocket.send(outPacket);
       }
       
    }
}
