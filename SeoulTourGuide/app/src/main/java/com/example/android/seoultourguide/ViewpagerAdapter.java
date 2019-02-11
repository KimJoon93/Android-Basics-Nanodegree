package com.example.android.seoultourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"tab1","tab2","tab3"};
    private Context context;

    public ViewpagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new Seoul_News_Page();
        }else if(i==1){
            return new Seoul_News_Page();
        }else{
            return new Seoul_News_Page();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
