package com.bupt.edison.androidmaterialdesignwidget;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FloatActionButtonActivity extends AppCompatActivity {

    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float_action_button);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.fab)
    public void onClick() {
//        Toast.makeText(FloatActionButtonActivity.this,"Run",Toast.LENGTH_SHORT).show();

        //使用SnackBar代替Toast
        //SnackBar具有滑动消除和交互功能,因此是一种比Toast更优秀的反馈机制
        //SnackBar会在屏幕的底部,所以make方法的第一个参数很重要,以确保它能被放置于底部
        Snackbar.make(findViewById(R.id.parentViewGroup),"SnackBar",Snackbar.LENGTH_LONG)
                .setAction("Run", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(FloatActionButtonActivity.this,"Start Running",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

        //此时的SnackBar会遮盖FloatingActionButton,而且不可滑动消除.
        //要解决这个问题,需要借助CoordinatorLayout.
    }
}
