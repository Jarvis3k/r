package com.example.rain.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.rain.R;

public class appsearchAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] mainTitle;



    public appsearchAdapter(@NonNull Activity context1, String[] mainTitle) {
        super(context1, R.layout.appsearch,mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;

    }

    public View getView(int position,View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.appsearch,null,true);

        TextView titleText = rowView.findViewById(R.id.title);


        titleText.setText(mainTitle[position]);


        return rowView;
    }
}
