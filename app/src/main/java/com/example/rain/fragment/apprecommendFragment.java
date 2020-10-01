package com.example.rain.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.rain.R;
import com.example.rain.adapter.appreccommendAdapter;

public class apprecommendFragment extends Fragment {



    public apprecommendFragment() {
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

    String[] btn1 = {
           "$0.99",
            "$0.99",
            "$0.99",
            "$0.99",


    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_apprecommend, container, false);

        // Inflate the layout for this fragment
        appreccommendAdapter adapter = new appreccommendAdapter(getActivity(),title,description,img,down,btn1);

        listView = view.findViewById(R.id.recommandlist);
        listView.setAdapter(adapter);
        return view;
    }
}