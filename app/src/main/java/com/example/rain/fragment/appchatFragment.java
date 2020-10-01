package com.example.rain.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rain.Model_App;
import com.example.rain.R;
import com.example.rain.adapter.Contact_appchat_adapter;

import java.util.ArrayList;
import java.util.List;


public class appchatFragment extends Fragment {
    private RecyclerView.Adapter adapter;
    List<Model_App> uData;



    public appchatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_appchat, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Contact_appchat_adapter(getContext(),uData);
        recyclerView.setAdapter(adapter);



        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        uData = new ArrayList<>();
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));
        uData.add(new Model_App(R.drawable.ic_appicondisplay,"App Name","Category"));



    }
}