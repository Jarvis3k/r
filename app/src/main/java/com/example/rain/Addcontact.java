package com.example.rain;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import com.example.rain.fragment.ContactinviteFragment;
import com.example.rain.fragment.ContactsearchFragment;

public class Addcontact extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    private ContactsearchFragment contactsearchFragment;
    private ContactinviteFragment contactinviteFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addcontact);

        viewPager = findViewById(R.id.view_pager2);
        tabLayout = findViewById(R.id.tablayout2);


        contactinviteFragment = new ContactinviteFragment();
        contactsearchFragment = new ContactsearchFragment();


        tabLayout.setupWithViewPager(viewPager);



        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(contactsearchFragment);
        viewPagerAdapter.addFragment(contactinviteFragment);
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setText("SEARCH");
        tabLayout .getTabAt(1).setText("INVITE");

        ImageView back = findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });


    }

    private class  ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment) {
            fragments.add(fragment);

        }


        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
    private void back() {
        this.onBackPressed();
    }
}
