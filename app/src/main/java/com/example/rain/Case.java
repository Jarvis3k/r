package com.example.rain;

public class Case {
    private String tit, des, con;

    public Case(){

    }

    public Case(String tit, String des, String con) {
        this.tit = tit;
        this.des = des;
        this.con = con;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }
}

