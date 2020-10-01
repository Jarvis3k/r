package com.example.rain.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.rain.R;
import com.example.rain.adapter.appupdateAdapter;

public class appupdatesFragment extends Fragment {


    public appupdatesFragment() {
        // Required empty public constructor
    }

    ListView listView;

    String[] title={
            "App Name",
            "App Name",
            "App Name",
            "App Name",
    };


    String[] description ={
            "Information",
            "Information",
            "Information",
            "Information",
    };

    Integer[] img = {
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay,
            R.drawable.ic_appicondisplay
    };

    Integer[] down = {
            R.drawable.arrow,
            R.drawable.arrow,
            R.drawable.arrow,
            R.drawable.arrow
    };

    String[] btn = {
           "Update",
            "Update",
            "Update",
            "Update",
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_appupdates, container, false);
        // Inflate the layout for this fragment

        appupdateAdapter adapter = new appupdateAdapter(getActivity(),title,description,img,down,btn);

        listView = view.findViewById(R.id.updateapplist);
        listView.setAdapter(adapter);




        return view;
    }
}