package com.graaab.intercomm.view.activities;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.graaab.intercomm.R;
import com.graaab.intercomm.view.activities.Tabs.TabContact;
import com.graaab.intercomm.view.activities.Tabs.TabHistory;

public class MainActivity extends AppCompatActivity
        implements TabContact.OnFragmentInteractionListener, TabHistory.OnFragmentInteractionListener{

    private int[] navIcons = { R.drawable.ic_contact, R.drawable.ic_history};
    private int[] navIconsActive = { R.drawable.ic_contact_active, R.drawable.ic_history_active};
    private int[] navLabel = { R.string.contact_tab, R.string.history_tab};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

//        for(int i= 0; i < navIcons.length ; i++){
//            tabLayout.getTabAt(i).setIcon(navIcons[i]);
//            tabLayout.getTabAt(i).setIcon(navIconsActive[i]);
//        }

        tabLayout.addTab(tabLayout.newTab().setText("Contact").setIcon(R.drawable.ic_contact_active));
        tabLayout.addTab(tabLayout.newTab().setText("History").setIcon(R.drawable.ic_history));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final PagerAdapter adapter = new com.graaab.intercomm.adapter.PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                tab.setIcon(navIconsActive[tab.getPosition()]);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                tab.setIcon(navIcons[tab.getPosition()]);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
