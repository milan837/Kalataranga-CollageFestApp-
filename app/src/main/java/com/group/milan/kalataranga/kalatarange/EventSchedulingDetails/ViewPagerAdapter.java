package com.group.milan.kalataranga.kalatarange.EventSchedulingDetails;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts.EightFragment;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts.FifthFragment;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts.FirstFragment;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts.FourthFragment;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts.SecondFragment;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts.SeventhFragment;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts.SixthFragment;
import com.group.milan.kalataranga.kalatarange.EventSchedulingDetails.TabLayouts.ThirdFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0){
            return new FirstFragment();
        }else if( i == 1){
            return new SecondFragment();
        }else if(i == 2){
            return new ThirdFragment();
        }else if(i == 3){
            return new FourthFragment();
        }else if(i == 4){
            return new FifthFragment();
        }else if(i == 5){
            return new SixthFragment();
        }else if(i == 6){
            return new SeventhFragment();
        }else if(i == 7){
            return new EightFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Mar 9th";
        }else if( position == 1){
            return "Mar 11th";
        }else if(position == 2){
            return "Mar 12th";
        }else if(position == 3){
            return "Mar 13th";
        }else if(position == 4){
            return "Mar 14th";
        }else if(position == 5){
            return "Mar 15th";
        }else if(position == 6){
            return "Mar 16th";
        }else if(position == 7){
            return "OFF STAGE Event";
        }

        return null;
    }
}
