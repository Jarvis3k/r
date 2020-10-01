package com.example.rain.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.rain.R;

public class appupdateAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final Integer[] img;
    private final Integer[] down;
    private final String[] btn;


    public appupdateAdapter(@NonNull  Activity context1, String[] mainTitle, String[] description, Integer[] img, Integer[] down, String[] button) {
        super(context1, R.layout.updatelayout,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.img = img;
        this.down = down;
        this.btn = button;

    }

    public View getView(int position,View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.updatelayout,null,true);

        TextView titleText = rowView.findViewById(R.id.title);
        TextView titletext1 = rowView.findViewById(R.id.title1);
        ImageView imageView = rowView.findViewById(R.id.icon);
        ImageView imageView1 = rowView.findViewById(R.id.down);
        Button buttonbtn  = rowView.findViewById(R.id.openbtn);

        titleText.setText(mainTitle[position]);
        titletext1.setText(description[position]);
        imageView.setImageResource(img[position]);
        imageView1.setImageResource(down[position]);
        buttonbtn.setText(btn[position]);


        return rowView;
    }
}
