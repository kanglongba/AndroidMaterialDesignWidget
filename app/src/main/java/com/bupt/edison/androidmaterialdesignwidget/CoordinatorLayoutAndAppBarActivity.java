package com.bupt.edison.androidmaterialdesignwidget;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.bupt.edison.androidmaterialdesignwidget.controller.AppInfoRecyclerAdapter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CoordinatorLayoutAndAppBarActivity extends AppCompatActivity {

    @Bind(R.id.recyclerview)
    RecyclerView recyclerview;

    List<ApplicationInfo> appList;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.tabLayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout_and_app_bar);
        ButterKnife.bind(this);

        findViews();
    }

    private void findViews() {
        toolbar.setTitle("AppBarLayout");

        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

        appList = getPackageManager().getInstalledApplications(0);
        AppInfoRecyclerAdapter adapter = new AppInfoRecyclerAdapter(appList, CoordinatorLayoutAndAppBarActivity.this);
        recyclerview.setLayoutManager(new LinearLayoutManager(CoordinatorLayoutAndAppBarActivity.this));
        recyclerview.setAdapter(adapter);

    }
}
