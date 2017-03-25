package com.example.wefky.myapplication;


/**
 * Created by wefky on 3/21/2017.
 */

public class ContactList {
    String name;
    String phoNum;
    public ContactList() {
    }

    public ContactList(String name, String phoNum) {
        this.name = name;
        this.phoNum = phoNum;
    }

    public ContactList(String name, String phoNum, int id) {
        this.name = name;
        this.phoNum = phoNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoNum() {
        return phoNum;
    }

    public void setPhoNum(String phoNum) {
        this.phoNum = phoNum;
    }
}
