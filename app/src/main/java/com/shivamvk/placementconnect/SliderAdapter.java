package com.shivamvk.placementconnect;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SliderAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs=0;
    public SliderAdapter(FragmentManager fm, int noOfTabs){
        super(fm);
        this.mNoOfTabs=noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WelcomeFragment();
            case 1:
                return new CampusStoriesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
