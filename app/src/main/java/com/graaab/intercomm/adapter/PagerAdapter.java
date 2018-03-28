package com.graaab.intercomm.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.graaab.intercomm.view.activities.Tabs.TabContactActivity;
import com.graaab.intercomm.view.activities.Tabs.TabHistoryActivity;

/**
 * Created by USER-28 on 27/3/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;

    public PagerAdapter(FragmentManager fm, int noTabs){
        super(fm);
        this.noOfTabs = noTabs;
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new TabContactActivity();
            case 1:
                // Games fragment activity
                return new TabHistoryActivity();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
