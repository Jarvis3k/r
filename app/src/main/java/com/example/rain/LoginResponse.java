package com.example.rain;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("email")
    private String Email;
    @SerializedName("password")
    private String Password;
    @SerializedName("id")
    public String ResponseCode;
    @SerializedName("result")
    public String ResponseMessage;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getResponseCode() {
        return ResponseCode;
    }

    public String getResponseMessage() {
        return ResponseMessage;
    }
}
