package com.example.MySB02.demo.model;

public class User {
    private String id;
    private String fName;
    private String lname;
    private String userName;
    private String email;

    public User(){

    }
    public User(String id,
                String fName,
                String lname,
                String userName,
                String email) {
        this.id = id;
        this.fName = fName;
        this.lname = lname;
        this.userName = userName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
