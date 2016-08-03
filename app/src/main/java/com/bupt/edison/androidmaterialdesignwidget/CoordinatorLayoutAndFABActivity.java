package com.bupt.edison.androidmaterialdesignwidget;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;

/**
 * CoordinatorLayout,协调者,顾名思义,它要与其他控件搭配使用,才能显示出威力.
 * CoordinatorLayout能赋予许多控件超能力,使它们在CoordinatorLayout中具有
 * 完全不同的表现(行为和功能).
 */
public class CoordinatorLayoutAndFABActivity extends AppCompatActivity {

    @butterknife.Bind(R.id.fab)
    android.support.design.widget.FloatingActionButton fab;
    @butterknife.Bind(R.id.coordinatorLayout)
    android.support.design.widget.CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout_and_fab);
        ButterKnife.bind(this);

        initViews();
    }

    private void initViews() {
        //在FloatActionButtonActivity中,我们在普通布局中使用FloatActionButton,
        //结果当SnackBar浮现时,会遮盖掉FloatActionButton.而如果我们在CoordinatorLayout
        //中使用FloatActionButton,当SnackBar浮现时,会自动把FloatActionButton顶上去,当
        //它消失时,FloatActionButton又会自动回到原来的位置.而且实现这个效果,不用添加
        //不用添加任何额外的代码,CoordinatorLayout自动处理这一切.
        //除此之外,SnackBar与CoordinatorLayout搭配使用,使SnackBar可以滑动消除了.也是自动获得的.

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(coordinatorLayout, "I'm a Snackbar", Snackbar.LENGTH_LONG).setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(CoordinatorLayoutAndFABActivity.this, "Snackbar Action", Toast.LENGTH_LONG).show();
                    }
                }).show();

            }
        });
    }
}
