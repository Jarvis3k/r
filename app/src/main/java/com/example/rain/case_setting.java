package com.example.rain;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class case_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_setting);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.nav_search:
                search();
                return true;
            case R.id.nav_case:
                cases();
                return true;
            case R.id.nav_recipient:
                recipient();
                return true;
            case R.id.nav_close:
                close();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void search() {
        Intent intent = new Intent(this, search.class);
        startActivity(intent);
    }
    private void cases() {
        Intent intent = new Intent(this, case_setting.class);
        startActivity(intent);
    }
    private void recipient(){
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(case_setting.this, R.style.BottomSheetDialogTheme);
        View bottom = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.activity_recipient_bottom, (ConstraintLayout) findViewById(R.id.bottomSheetContainer));
        bottomSheetDialog.setContentView(bottom);
        bottomSheetDialog.show();
    }
    private void close() {
        final Dialog dialog = new Dialog(case_setting.this);
        dialog.setContentView(R.layout.case_close_contact);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, caseGroupChat.class);
        startActivity(intent);
    }
}