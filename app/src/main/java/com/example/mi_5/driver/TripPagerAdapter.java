package com.example.mi_5.driver;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class TripPagerAdapter extends FragmentPagerAdapter {

    TripPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private final String[] title = {"Trip messages","Trip contacts"};

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return  new TripContactsFragment();

        if (position == 1) {
            return  new TripMessagesFragment();
        }

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
