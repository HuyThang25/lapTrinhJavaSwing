/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaswing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ASUS TUF
 */

public class HashTable {
     //SHA (Secure Hash Algorithm)
    //MD5 (Message Digest)
    public String hashMD5(String myMessage) throws NoSuchAlgorithmException{
        byte[] digest=md5(myMessage);
        String hash=hexaToString(digest);
        return hash;
    }
    public String hashSHA1(String myMessage) throws NoSuchAlgorithmException{
        byte[] digest=sha1(myMessage);
        String hash=hexaToString(digest);
        return hash;
    }
    public String hashSHA256(String myMessage) throws NoSuchAlgorithmException{
        byte[] digest=sha256(myMessage);
        String hash=hexaToString(digest);
        return hash;
    }
    public String hashSHA512(String myMessage) throws NoSuchAlgorithmException{
        byte[] digest=sha512(myMessage);
        String hash=hexaToString(digest);
        return hash;
    }
    public String hashSHA3256(String myMessage) throws NoSuchAlgorithmException{
        byte[] digest=sha3256(myMessage);
        String hash=hexaToString(digest);
        return hash;
    }

    
     public static byte[] sha1(String message) throws NoSuchAlgorithmException{   
        MessageDigest md = MessageDigest.getInstance("SHA-1"); 
        md.update(message.getBytes());
        byte[] digest = md.digest();
        return digest;
    }
     
    public static byte[] sha256(String message) throws NoSuchAlgorithmException{   
        MessageDigest md = MessageDigest.getInstance("SHA-256"); //SHA (Secure Hash Algorithm)
        md.update(message.getBytes());
        byte[] digest = md.digest();
        return digest;
    }
     public static byte[] sha3256(String message) throws NoSuchAlgorithmException{   
        MessageDigest md = MessageDigest.getInstance("SHA3-256"); //SHA (Secure Hash Algorithm)
        md.update(message.getBytes());
        byte[] digest = md.digest();
        return digest;
    }
    
     public static byte[] sha512(String message) throws NoSuchAlgorithmException{   
        MessageDigest md = MessageDigest.getInstance("SHA-512"); //SHA (Secure Hash Algorithm)
        md.update(message.getBytes());
        byte[] digest = md.digest();
        return digest;
    }
    
    public static byte[] md5(String message) throws NoSuchAlgorithmException{   
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(message.getBytes());
        byte[] digest = md.digest();
        return digest;
    }
    
    
    public static String hexaToString(byte[] digest ){
        // Convert digest to a string
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < digest.length; i++) {
            if ((0xff & digest[i]) < 0x10) {
                hexString.append("0").append(Integer.toHexString((0xFF & digest[i])));
              } else {
                hexString.append(Integer.toHexString(0xFF & digest[i]));
            }
        }  
        return hexString.toString();  
    }
}
