package com.yipai.tongzhouli.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.widget.EditText;
import android.widget.ImageView;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.ui.adapter.LoginAdapter;
import com.yipai.tongzhouli.ui.fragment.LoginFragment;
import com.yipai.tongzhouli.ui.fragment.RegistFragment;
import com.yipai.tongzhouli.ui.widget.CustomViewPager;
import com.yipai.tongzhouli.ui.widget.MyFontButton;

import java.util.ArrayList;

/**
 * A login screen that offers login via email/password.
 */
public class UpdatePassActivity extends BaseActivity  {


    private EditText newPassET ,newPassAgainET;
    private MyFontButton saveBT;

    @Override
    protected void initData() {

    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_update_pass);
    }

    @Override
    protected void initView() {
        setTitle("忘记密码");

        newPassET=(EditText)findViewById(R.id.et_new_pass);
        newPassAgainET=(EditText)findViewById(R.id.et_new_pass_again);

        saveBT=(MyFontButton)findViewById(R.id.bt_save);


    }

    @Override
    protected void initEvent() {
        saveBT.setOnClickListener(this);
    }

    @Override
    protected void onClick(int resId) {
        switch(resId){

            case R.id.bt_save:
                jumpToNext(LoginActivity.class);
                finish();
                break;



        }
    }


}

