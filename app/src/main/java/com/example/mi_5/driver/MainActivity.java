package com.example.mi_5.driver;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.pager);

        SectionsPager mSectionsPager = new SectionsPager(getSupportFragmentManager());
        viewPager.setAdapter(mSectionsPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_earn);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_person);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_vv);
    }
}
