package com.example.rain.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.rain.adapter.MyappsAdapter;
import com.example.rain.R;


public class myappsFragment extends Fragment {


    public myappsFragment() {
        // Required empty public constructor
    }
    GridView gridView;
    String[] word={"App Name","App Name","App Name","App Name","App Name","App Name","App Name","App Name"};
    int[] image = {R.drawable.ic_appicondisplay,R.drawable.ic_appicondisplay,R.drawable.ic_appicondisplay,R.drawable.ic_appicondisplay,R.drawable.ic_appicondisplay,R.drawable.ic_appicondisplay,R.drawable.ic_appicondisplay,R.drawable.ic_appicondisplay};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_myapps, container, false);


        gridView = view.findViewById(R.id.grid);

        MyappsAdapter adapter = new MyappsAdapter(getActivity(),word,image);
        gridView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }
}