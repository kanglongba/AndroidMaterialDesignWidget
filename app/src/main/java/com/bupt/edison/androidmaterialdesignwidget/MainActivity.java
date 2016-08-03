package com.bupt.edison.androidmaterialdesignwidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.MD_NavigationView)
    Button MDNavigationView;
    @Bind(R.id.google_navigationview)
    Button googleNavigationview;
    @Bind(R.id.md_textinput)
    Button mdTextinput;
    @Bind(R.id.md_floatactionbuttion)
    Button mdFloatactionbuttion;

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

    @OnClick(R.id.google_navigationview)
    public void onClickGoogle() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
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
}
