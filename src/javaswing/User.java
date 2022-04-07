/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

/**
 *
 * @author ASUS TUF
 */
public class User {
    
    private String user;
    private String password;
    private int salt;
    private String confirmPassword;
    private boolean isMale;
    private String address;
    private String job;

    public User() {
    }

    public User(String user, String password, int salt, boolean isMale, String address, String job) {
        this.user = user;
        this.password = password;
        this.salt = salt;
        this.isMale = isMale;
        this.address = address;
        this.job = job;
    }

    
    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return  user + "," + password + "," + salt + "," + isMale + "," + address + "," + job;
    }

    
}
