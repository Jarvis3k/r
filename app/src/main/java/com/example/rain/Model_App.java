package com.example.rain;

public class Model_App {

    private int img;
    private String appName;
    private String appCategory;

    public Model_App(int img, String appName, String appCategory) {
        this.img = img;
        this.appName = appName;
        this.appCategory = appCategory;
    }


    public int getImg() {
        return img;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppCategory() {
        return appCategory;
    }
}
