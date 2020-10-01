package com.example.rain;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.example.rain.fragment.apprecommendFragment;
import com.example.rain.fragment.appsearchFragment;
import com.example.rain.fragment.appupdatesFragment;
import com.example.rain.fragment.myappsFragment;

public class Appsactivity extends AppCompatActivity {
    public static TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);
        tv = findViewById(R.id.apptitle);

        BottomNavigationView btnNav = findViewById(R.id.bottomNav2);
        btnNav.setOnNavigationItemSelectedListener(navListerner);

        getSupportFragmentManager().beginTransaction().replace(R.id.container2,new myappsFragment()).commit();
        tv.setText("My Apps");
        ImageView appbar = findViewById(R.id.Chats);
        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chats();
            }
        });

    }

    private void chats() {
        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListerner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.myapps_icon:
                    selectedFragment = new myappsFragment();
                    tv.setText("My Apps");
                    break;

                case R.id.appupdates_icon:
                    selectedFragment = new appupdatesFragment();
                    tv.setText("Updates");
                    break;
                case R.id.apprecommendation_icon:
                    selectedFragment = new apprecommendFragment();
                    tv.setText("Recommendation");
                    break;
                case R.id.appsearch_icon:
                    selectedFragment = new appsearchFragment();
                    tv.setText("Search");
                    break;


            }

            getSupportFragmentManager().beginTransaction().replace(R.id.container2,selectedFragment).commit();
            return true;
        }
    };


}



