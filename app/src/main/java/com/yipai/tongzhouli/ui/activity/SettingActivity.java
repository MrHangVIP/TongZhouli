package com.yipai.tongzhouli.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.ui.adapter.LoginAdapter;
import com.yipai.tongzhouli.ui.fragment.LoginFragment;
import com.yipai.tongzhouli.ui.fragment.RegistFragment;
import com.yipai.tongzhouli.ui.widget.CustomViewPager;
import com.yipai.tongzhouli.ui.widget.MyFontTextView;

import java.util.ArrayList;

/**
 * Created by moram on 2016/9/22.
 */
public class SettingActivity extends BaseActivity  {


    private MyFontTextView loginRegistTV;

    @Override
    protected void initData() {

    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_setting);
    }

    @Override
    protected void initView() {
        setTitle("设置");

        loginRegistTV=(MyFontTextView)findViewById(R.id.tv_login_and_regist);


    }

    @Override
    protected void initEvent() {
        loginRegistTV.setOnClickListener(this);
    }

    @Override
    protected void onClick(int resId) {
        switch(resId){

            case R.id.tv_login_and_regist:
                jumpToNext(LoginActivity.class);;

                break;



        }
    }


}

