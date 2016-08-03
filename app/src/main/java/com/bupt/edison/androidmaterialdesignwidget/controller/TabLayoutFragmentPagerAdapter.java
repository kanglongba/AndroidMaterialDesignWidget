package com.bupt.edison.androidmaterialdesignwidget.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by edison on 16/8/3.
 */
public class TabLayoutFragmentPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragments;

    public TabLayoutFragmentPagerAdapter(FragmentManager fm,List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //与TabLayout搭配使用时,返回的是对应的选项卡的title
        return "Your Tab "+position;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
}
