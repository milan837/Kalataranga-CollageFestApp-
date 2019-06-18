package com.group.milan.kalataranga.kalatarange.AllEventActivity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.group.milan.kalataranga.kalatarange.AllEventActivity.fragments.IndoorEventFragment;
import com.group.milan.kalataranga.kalatarange.AllEventActivity.fragments.OffstageEventFragment;
import com.group.milan.kalataranga.kalatarange.AllEventActivity.fragments.OnstageEventFragment;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.ViewPagerAdapter;

public class EventViewPagerAdapter extends FragmentPagerAdapter {
    public EventViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0){
            return new IndoorEventFragment();
        }else if( i== 1){
            return new OffstageEventFragment();
        }else if(i==2){
            return new OnstageEventFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Sports";
        }else if(position == 1){
            return "Offstage";
        }else if(position == 2){
            return "Onstage";
        }
        return null;
    }
}
