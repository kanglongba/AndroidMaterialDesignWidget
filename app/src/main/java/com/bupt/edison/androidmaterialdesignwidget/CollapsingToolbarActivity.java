package com.bupt.edison.androidmaterialdesignwidget;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.bupt.edison.androidmaterialdesignwidget.controller.AppInfoRecyclerAdapter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 可以折叠的ToolBar
 * 要实现这个效果,需要CoordinatorLayout,AppBarLayout,CollapsingToolbarLayout和Toolbar配合使用
 */
public class CollapsingToolbarActivity extends AppCompatActivity {

    List<ApplicationInfo> appList;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.CollapsingToolbarLayout)
    android.support.design.widget.CollapsingToolbarLayout CollapsingToolbarLayout;
    @Bind(R.id.AppBarLayout)
    android.support.design.widget.AppBarLayout AppBarLayout;
    @Bind(R.id.recyclerview)
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);
        ButterKnife.bind(this);

        findViews();
    }

    private void findViews() {
//        toolbar.setTitle("CollapsingToolbar");
        CollapsingToolbarLayout.setTitle("CollapsedToolbar");//设置ToolBar的title.CollapsingToolbarLayout与ToolBar结合使用时,官方推荐在CollapsingToolbarLayout设置标题

        appList = getPackageManager().getInstalledApplications(0);
        AppInfoRecyclerAdapter adapter = new AppInfoRecyclerAdapter(appList,CollapsingToolbarActivity.this);
        recyclerview.setLayoutManager(new LinearLayoutManager(CollapsingToolbarActivity.this));
        recyclerview.setAdapter(adapter);
    }
}
