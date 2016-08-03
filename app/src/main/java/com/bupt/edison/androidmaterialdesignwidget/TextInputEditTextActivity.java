package com.bupt.edison.androidmaterialdesignwidget;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TextInputEditTextActivity extends AppCompatActivity {

    @Bind(R.id.textEditLayout)
    TextInputLayout textEditLayout;
    @Bind(R.id.textInputEdit)
    TextInputEditText textInputEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_edit_text);
        ButterKnife.bind(this);

        textEditLayout.setErrorEnabled(true);
        textInputEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()>18){
                    textEditLayout.setError("length should be less than 18"); //添加错误提示
                }else{
                    if(!TextUtils.isEmpty(textEditLayout.getError())) {
                        textEditLayout.setError(null); //清除错误提示
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}
