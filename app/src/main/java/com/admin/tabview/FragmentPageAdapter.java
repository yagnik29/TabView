package com.admin.tabview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by admin on 3/16/2017.
 */

public class FragmentPageAdapter extends FragmentPagerAdapter {
    
    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> fragmentTitle = new ArrayList<>();
    
    

    public FragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void addFragment(Fragment fragment, String title){
        fragments.add(fragment);
        fragmentTitle.add(title);
    }
    
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
