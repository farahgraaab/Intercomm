package com.graaab.intercomm.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by USER-28 on 27/3/2018.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                // Top Rated fragment activity
//                return new TopRatedFragment();
            case 1:
                // Games fragment activity
//                return new GamesFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
