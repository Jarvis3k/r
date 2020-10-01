package com.example.rain.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;

import androidx.viewpager.widget.ViewPager;

import com.example.rain.R;
import com.example.rain.adapter.ViewPagerAdapter;
import com.example.rain.dashboard;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class  contactFragment extends Fragment {



    public contactFragment() {


        // Required empty public constructor
    }
    private chatFragment chatfragment;
    private messageFragment messagefragment;
    private appchatFragment appchatfragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        dashboard.settext("Contact");



        TabLayout tabLayout = view.findViewById(R.id.tabBar);
        final ViewPager viewPager = view.findViewById(R.id.viewpager);
        TabItem contact = view.findViewById(R.id.chat);
        TabItem message = view.findViewById(R.id.message);
        TabItem app = view.findViewById(R.id.app);


        chatfragment = new chatFragment();
        messagefragment = new messageFragment();
        appchatfragment = new appchatFragment();
        tabLayout.setupWithViewPager(viewPager);



        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getChildFragmentManager(),tabLayout.getTabCount());

        pagerAdapter.addFragment(chatfragment,"Contact");
        pagerAdapter.addFragment(messagefragment,"Message");
        pagerAdapter.addFragment(appchatfragment,"App Chat");

        viewPager.setAdapter(pagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_contact);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_message);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_appchat);
        return view;
    }


}