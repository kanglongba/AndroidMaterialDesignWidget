package com.bupt.edison.androidmaterialdesignwidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * http://android-developers.blogspot.com/2015/05/android-design-support-library.html
 * 翻译:http://www.jcodecraeer.com/a/anzhuokaifa/developer/2015/0531/2958.html
 * 这边文件讲到了很多细节,很值得一看http://www.jianshu.com/p/1078568e859f#
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.MD_NavigationView)
    Button MDNavigationView;
    @Bind(R.id.md_textinput)
    Button mdTextinput;
    @Bind(R.id.md_floatactionbuttion)
    Button mdFloatactionbuttion;
    @Bind(R.id.md_tabLayout)
    Button mdTabLayout;
    @Bind(R.id.md_CoordinatorLayoutAndFAB)
    Button mdCoordinatorLayoutAndFAB;
    @Bind(R.id.md_CoordinatorLayoutAndAppBar)
    Button mdCoordinatorLayoutAndAppBar;
    @Bind(R.id.md_CollapsingToolbar)
    Button mdCollapsingToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.MD_NavigationView)
    public void onClick() {
        Intent intent = new Intent(MainActivity.this, NavigationViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.md_textinput)
    public void onClickTextInput() {
        Intent intent = new Intent(MainActivity.this, TextInputEditTextActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.md_floatactionbuttion)
    public void onClickFAB() {
        Intent intent = new Intent(MainActivity.this, FloatActionButtonActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.md_tabLayout)
    public void onClickTabLayout() {
        Intent intent = new Intent(MainActivity.this, TabLayoutActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.md_CoordinatorLayoutAndFAB)
    public void onClickCoordinatorLayoutAndFAB() {
        Intent intent = new Intent(MainActivity.this, CoordinatorLayoutAndFABActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.md_CoordinatorLayoutAndAppBar)
    public void onClickWithAppBar() {
        Intent intent = new Intent(MainActivity.this, CoordinatorLayoutAndAppBarActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.md_CollapsingToolbar)
    public void onClickCollapsingToolbar() {
        Intent intent = new Intent(MainActivity.this, CollapsingToolbarActivity.class);
        startActivity(intent);
    }
}
