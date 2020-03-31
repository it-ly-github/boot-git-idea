package com.java.pojo;

public class Admin {
    private String uName = "王";
    private String gender = "男";

    public Admin(){
        System.out.println("admin....");
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
