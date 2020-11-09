package com.qf.pojo;

public class User {
    private  Integer uid;
    private  String uname;
    private  String ugender;
    private  String upass;
    private  String uemail;
    

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", ugender='" + ugender + '\'' +
                ", upass='" + upass + '\'' +
                ", uemail='" + uemail + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer uid, String uname, String ugender, String upass, String uemail) {
        this.uid = uid;
        this.uname = uname;
        this.ugender = ugender;
        this.upass = upass;
        this.uemail = uemail;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }
}
