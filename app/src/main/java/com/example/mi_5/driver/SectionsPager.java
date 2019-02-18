package com.example.mi_5.driver;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionsPager extends FragmentPagerAdapter {


    private final String[] title = {"Home","Earnings","Ratings","Account","Online"};

    public SectionsPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return  new HomeFragment();
        if (position == 1) return  new EarningFragment();
        if (position == 2) return  new RatingFragment();
        if (position == 3) return  new AccountFragment();
        if (position == 4) return  new OnlineFragment();
        return null;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }


}

