package com.example.android.seoultourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerAdapter extends FragmentPagerAdapter {

    private int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{"Seoul News","Enjoy","Map","Info"};
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
            return new Enjoy_Page();
        }else if(i==2){
            return new Map_Page();
        }else{
            return new Info_Page();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
