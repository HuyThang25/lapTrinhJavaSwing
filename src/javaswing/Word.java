/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Word {
    private String en;
    private String vn;

    public Word() {
    }

    public Word(String en, String vn) {
        this.en = en;
        this.vn = vn;
    }


    public String getEn() {
        return en;
    }

    public String getVn() {
        return vn;
    }



    public void setEn(String en) {
        this.en = en;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    @Override
    public String toString() {
        return "Word{"+"en=" + en + ", vn=" + vn + '}';
    }
    public String toStringFile(){
        return en+","+vn;
    }
    public void showInfo(){
        System.out.println(toString());
    }
    public void inputInfo(Word w){
        en= w.getEn();
        vn=w.getVn();
    }
    
}
