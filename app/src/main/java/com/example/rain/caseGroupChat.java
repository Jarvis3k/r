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
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class caseGroupChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.case_group_chat);

        TextView button = findViewById(R.id.Recipient);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(caseGroupChat.this, R.style.BottomSheetDialogTheme);
                View bottom = LayoutInflater.from(getApplicationContext())
                        .inflate(R.layout.activity_recipient_bottom, (ConstraintLayout) findViewById(R.id.bottomSheetContainer));

                bottomSheetDialog.setContentView(bottom);
                bottomSheetDialog.show();
            }
        });
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
            case R.id.nav_delete:
                delete();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void delete() {
        final Dialog dialog = new Dialog(caseGroupChat.this);
        dialog.setContentView(R.layout.activity_delete_case);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
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
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(caseGroupChat.this, R.style.BottomSheetDialogTheme);
        View bottom = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.activity_recipient_bottom, (ConstraintLayout) findViewById(R.id.bottomSheetContainer));
        bottomSheetDialog.setContentView(bottom);
        bottomSheetDialog.show();
    }
    private void close() {
        final Dialog dialog = new Dialog(caseGroupChat.this);
        dialog.setContentView(R.layout.case_close_contact);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void goBack(View view) {
        this.onBackPressed();


    }
}