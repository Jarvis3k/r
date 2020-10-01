package com.example.rain.fragment;


import android.content.Intent;
import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rain.Addcontact;
import com.example.rain.Model_Contact;
import com.example.rain.R;
import com.example.rain.adapter.Contact_chat_adapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class chatFragment extends Fragment {

    public chatFragment() {

        // Required empty public constructor
    }
    private RecyclerView.Adapter adapter;
    List<Model_Contact> uData;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Contact_chat_adapter(getContext(),uData);
        recyclerView.setAdapter(adapter);

        final ExtendedFloatingActionButton addcontact = view.findViewById(R.id.addcontactbutton);
        addcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addcontact();
            }
        });


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        uData = new ArrayList<>();
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
        uData.add(new Model_Contact(R.drawable.avatar,"FirstName","LastName","CompanyName","Group"));
    }

    private void addcontact() {
        Intent intent = new Intent(getContext(), Addcontact.class);
        startActivity(intent);
    }

}