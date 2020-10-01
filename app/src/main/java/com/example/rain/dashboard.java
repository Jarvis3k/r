package com.example.rain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import com.example.rain.fragment.casesFragment;
import com.example.rain.fragment.contactFragment;
import com.example.rain.fragment.searchFragment;

public class dashboard<r> extends AppCompatActivity {

    private ChipNavigationBar chipNavigationBar;
    private Fragment fragment = null;
    public static TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        tv = findViewById(R.id.dashboardtitle);
        chipNavigationBar = findViewById(R.id.bottonNav);
        chipNavigationBar.setItemSelected(R.id.cases, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new casesFragment()).commit();
        tv.setText("Cases");
        ImageView appbar = findViewById(R.id.Apps);
        appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apps();
            }
        });




        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id.contact:
                        fragment = new contactFragment();
                        settext("Contact");
                        break;
                    case R.id.cases:
                        fragment = new casesFragment();
                        settext("Cases");
                        break;
                    case R.id.search:
                        fragment = new searchFragment();
                        settext("Search Chat");
                        break;


                }
                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                }


            }
        });
    }


    private void apps() {

        Intent intent = new Intent(this, Appsactivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }


    public static void settext(String r){
        tv.setText(r);
    }



}
