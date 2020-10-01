package com.example.rain.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rain.Case;
import com.example.rain.adapter.Case_view_adapter;
import com.example.rain.R;
import com.example.rain.caseGroupChat;

import java.util.ArrayList;
import java.util.List;


public class casesFragment extends Fragment implements Case_view_adapter.OnCaseListener {
    private RecyclerView recyclerView;
    private List<Case> caselist ;


    public casesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cases, container, false);
        recyclerView = view.findViewById(R.id.cases_recyclerView);
        Case_view_adapter case_view_adapter = new Case_view_adapter(getContext(),caselist,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(case_view_adapter);






        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        caselist = new ArrayList<>();
        caselist.add(new Case("1234-5678","The Name of the case","Practice Area"));
        caselist.add(new Case("1234-5678","The Name of the case","Practice Area"));
        caselist.add(new Case("1234-5678","The Name of the case","Practice Area"));
        caselist.add(new Case("1234-5678","The Name of the case","Practice Area"));
        caselist.add(new Case("1234-5678","The Name of the case","Practice Area"));
        caselist.add(new Case("1234-5678","The Name of the case","Practice Area"));


    }

    @Override
    public void onCaseClick(int position) {
        Intent intent = new Intent(getActivity(), caseGroupChat.class);
        startActivity(intent);
    }
}