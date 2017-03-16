package com.admin.tabview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.pager);

        FragmentPageAdapter fragmentPageAdapter = new FragmentPageAdapter(getSupportFragmentManager());
        fragmentPageAdapter.addFragment(new Appliences(),"Music");
        fragmentPageAdapter.addFragment(new Books(),"Books");
        fragmentPageAdapter.addFragment(new Wearable(),"Wear");

        viewPager.setAdapter(fragmentPageAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
