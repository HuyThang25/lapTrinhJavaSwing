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
import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Dictionary {
     ArrayList<Word> ds = new ArrayList<>();
    public void menu(){
        System.out.println("1. Tìm từ theo tiền tố");
        System.out.println("2. Tìm từ");
        System.out.println("3. Thêm từ");
        System.out.println("4. Xoá Từ");
        System.out.println("5. Sửa từ");
        System.out.println("6. Hiển thị danh sách từ");
        System.out.println("7. Thoát");
    }
    public int findByEnglish(String Word){
        for (int i=0; i<ds.size(); i++){
            if (ds.get(i).getEn().equalsIgnoreCase(Word)) return i;
        }
        return -1;
    }
    
    public int findByVietnamese(String Word){
        for (int i=0; i<ds.size(); i++){
            if (ds.get(i).getVn().equalsIgnoreCase(Word)) return i;
        }
        return -1;
    }


    public  boolean themTu(Word tmp){
        if (findByEnglish(tmp.getEn())==-1){
            ds.add(tmp);
            return true;
        }
        else {
            return false;
        }
    }
    public void timTu(String Word){
        if (findByEnglish(Word)==-1){
            System.out.println("Khong co tu "+Word+" trong tu dien");
        }
        else {
            ds.get(findByEnglish(Word)).showInfo();
        }
    }
    public void doi(String tu, Word w){
        ds.get(this.findByEnglish(tu)).inputInfo(w);
    }
    public boolean xoaTu(String Word){
        int vt=findByEnglish(Word);
        if (vt==-1){
            return false;
        }
        else {
            ds.remove(vt);
            return true;
        }
    }

    public ArrayList<Word> getDs() {
        return ds;
    }
    private char upcase(char c){
        if (c>='a' && c<='z') c-=32;
        return c;
    }
    private boolean laTienTo(String child,String parent){
        if (child.length()>parent.length()) return false;
        else if (child.length()==parent.length() && child.equalsIgnoreCase(parent)) return false;
        else if (child.length()==parent.length()) return true;
        else {
            for (int i=0; i<child.length(); i++){
                if (upcase(child.charAt(i))!=upcase(parent.charAt(i))) return false;
            }
            return true;
        }
    }
    public void remove(int index){
        ds.remove(index);
    }
    public void timTheoTienTo(String tienTo){
        boolean tonTai=false;
        for (Word x: ds){
            if (laTienTo(tienTo,x.getEn())) {
                tonTai=true;
                x.showInfo();
            }
        }
        if(!tonTai) System.out.println("Khong co tu nao");
    }
    public void hienThiDanhSach(){
        System.out.println("\tDanh sách từ vựng");
        ds.forEach((x) -> {
            x.showInfo();
        });
    }
    public void saveToFile() throws IOException{
        File f= new File("D:\\NetBeans\\JavaSwing\\src\\javaswing\\TuDien.txt");
         try (FileWriter fw = new FileWriter(f); BufferedWriter bw = new BufferedWriter(fw)) {
             for (Word x: ds){
                 bw.write(x.toStringFile());
                 bw.newLine();
             }
         }
    }
    public void readFromFile() throws FileNotFoundException, IOException{
        File f= new File("D:\\NetBeans\\JavaSwing\\src\\javaswing\\TuDien.txt");
         try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
             String str;
             while ((str = br.readLine()) != null){
                 String arr[]=str.split(",");
                 Word w= new Word(arr[0],arr[1]);
                 ds.add(w);
                 
             }
         }
    }
    
}
