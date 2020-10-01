package com.example.rain.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.rain.R;
import com.example.rain.adapter.appsearchAdapter;


public class appsearchFragment extends Fragment {

    public appsearchFragment() {
        // Required empty public constructor
    }
    ListView listView;

    String[] title={
            "Document",
            "Schedule",
            "Billing",
            "Communicate",
            "Document",
            "Schedule",
            "Billing",
            "Communicate",
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_appsearch, container, false);
        // Inflate the layout for this fragment

        appsearchAdapter adapter = new appsearchAdapter(getActivity(),title);

        listView = view.findViewById(R.id.catagories);
        listView.setAdapter(adapter);


        return view;
    }
}