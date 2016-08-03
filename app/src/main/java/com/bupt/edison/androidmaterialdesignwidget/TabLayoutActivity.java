package com.bupt.edison.androidmaterialdesignwidget;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.bupt.edison.androidmaterialdesignwidget.controller.TabLayoutFragmentPagerAdapter;
import com.bupt.edison.androidmaterialdesignwidget.view.TabLayoutOneFragment;
import com.bupt.edison.androidmaterialdesignwidget.view.TabLayoutThreeFragment;
import com.bupt.edison.androidmaterialdesignwidget.view.TabLayoutTwoFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TabLayoutActivity extends AppCompatActivity {

    @Bind(R.id.tabLayout)
    TabLayout tabLayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;

    List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        ButterKnife.bind(this);
        initViews();
    }

    private void initViews() {
        TabLayoutOneFragment oneFragment = new TabLayoutOneFragment();
        TabLayoutTwoFragment twoFragment = new TabLayoutTwoFragment();
        TabLayoutThreeFragment threeFragment = new TabLayoutThreeFragment();
        fragments.add(oneFragment);
        fragments.add(twoFragment);
        fragments.add(threeFragment);

        TabLayoutFragmentPagerAdapter pagerAdapter = new TabLayoutFragmentPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(pagerAdapter);

        //将TabLayout与ViewPager联系在一起.选项卡滑动时与ViewPager滑动时,能够互相更新对方.
        //有一个问题,点击选项卡,并不能更新ViewPager.????
        tabLayout.setupWithViewPager(viewPager);

    }
}
