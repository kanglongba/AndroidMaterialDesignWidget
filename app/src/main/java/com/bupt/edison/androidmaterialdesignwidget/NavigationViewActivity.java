package com.bupt.edison.androidmaterialdesignwidget;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;

/**
 * 把这个Activity的ActionBar替换成ToolBar.
 */
public class NavigationViewActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);
        ButterKnife.bind(this);

        //初始化ToolBar
        initToolBar();

        //初始化NavigationView
        findViews();
    }

    /**
     * ToolBar实际上是服用了原来的menu控件.
     */
    private void initToolBar(){
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("NavigationView");
        setSupportActionBar(toolbar);

        //通过这段代码可以在ToolBar的左边设置一个图标,并且可以在onOptionsItemSelected
        //方法中,对这个图标的点击事件做响应.但是图标没有任何动画效果
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
//        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    /**
     * NavigationView与ActionBar配合使用时,会有一些小问题:
     * 1. ActionBar会遮盖掉NavigationView的顶层部分.
     * 2. ActionBar不方便打开DrawerLayout
     * 因为Google官方已经抛弃了ActionBar,并推荐使用ToolBar(现在叫AppBar)完全代替ActionBar.
     * 所以,我们在使用NavigationView时,应该搭配ToolBar使用.
     */
    private void findViews(){
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView = (NavigationView)findViewById(R.id.navigation_view);
        //处理NavigationView中的菜单点击事件
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                //点击菜单时,NavigationView会自动把菜单项高亮
                //item.setChecked(true);
                drawerLayout.closeDrawers();
                Toast.makeText(NavigationViewActivity.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        //通过这段代码可以为ToolBar设置一个默认的汉堡图标,并且点击图标可以自动打开NavigationView.
        //通过这种方法,当NavigationView打开或关闭时,图标会有一个动画效果.
        //一般都会用这种方法代替initToolBar()方法中的那段代码.
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }
}
