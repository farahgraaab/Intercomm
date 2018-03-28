package com.graaab.intercomm.view.activities.Tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.graaab.intercomm.R;

/**
 * Created by USER-28 on 27/3/2018.
 */

public class TabHistoryActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_tab_history, container, false);

        return rootView;
    }
}
