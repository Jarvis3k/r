package com.example.rain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class forgotpassword extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpassword);

        TextView login_in = findViewById(R.id.login_in);
        login_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        TextView sign_in = findViewById(R.id.sign_in);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign_in();
            }
        });

        Button forgotbutton = findViewById(R.id.forgotbutton);
        forgotbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newpassword();
            }
        });
    }
    private void newpassword() {
        Intent intent = new Intent(this, newpassword.class);
        startActivity(intent);
    }
    private void login() {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
    private void sign_in() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
}

