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

public class appreccommendAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;
    private final String[] description;
    private final Integer[] img;
    private final Integer[] down;
    private final String[] btn1;


    public appreccommendAdapter(@NonNull  Activity context1, String[] mainTitle, String[] description, Integer[] img, Integer[] down, String[] btn1) {
        super(context1, R.layout.recommandlayout,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.description = description;
        this.img = img;
        this.down = down;
        this.btn1 = btn1;

    }

    public View getView(int position,View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.recommandlayout,null,true);

        TextView titleText = rowView.findViewById(R.id.title);
        TextView titletext1 = rowView.findViewById(R.id.title1);
        ImageView imageView = rowView.findViewById(R.id.icon);
        ImageView imageView1 = rowView.findViewById(R.id.down);
        Button buttonbtn  = rowView.findViewById(R.id.openbtn1);

        titleText.setText(mainTitle[position]);
        titletext1.setText(description[position]);
        imageView.setImageResource(img[position]);
        imageView1.setImageResource(down[position]);
        buttonbtn.setText(btn1[position]);

        return rowView;
    }
}
