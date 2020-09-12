package com.example.firebaserealtimedatabase;

public class POJO {
    private String fname;
    private String lname;

    public POJO() {
    }

    public POJO(String fname,String lname) {
        this.lname = lname;
        this.fname=fname;
    }

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
