package com.example.rain;

public class Model_Contact {

    private int img;
    private String firstName;
    private String lastName;
    private String companyName;
    private String group;

    public Model_Contact(int img, String firstName, String lastName, String companyName, String group) {
        this.img = img;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.group = group;
    }
    public int getImg() {
        return img;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getGroup() {
        return group;
    }



}
