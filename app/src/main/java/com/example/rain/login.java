package com.example.rain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class login extends AppCompatActivity {

    EditText email, password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btnlogin);

        TextView sign_in = findViewById(R.id.sign_in);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup();
            }
        });

        TextView forgotpassword = findViewById(R.id.forgotpassword);
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotpassword();
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(email.getText().toString())||TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(login.this,"Email/Password Required",Toast.LENGTH_SHORT).show();
                }
                else{
                    login();
                }
            }
        });
    }

    public  void  login(){
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail(email.getText().toString());
        loginRequest.setPassword(password.getText().toString());

        Call<LoginResponse> loginResponseCall = ApiClient.getUserService().userLogin(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                LoginResponse loginResponse = response.body();

                String responseMessage = loginResponse.getResponseMessage();

                if (response.isSuccessful()) {
                    Toast.makeText(login.this, responseMessage, Toast.LENGTH_SHORT).show();

                    if (responseMessage.equals("success")) {

                        Toast.makeText(login.this, "Login Sucessfull", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(login.this, dashboard.class));

                    }
                    else {

                        Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
                }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(login.this,"Throwable "+ t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
    private void signup() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

    private void forgotpassword() {
        Intent intent = new Intent(this, forgotpassword.class);
        startActivity(intent);
    }

}