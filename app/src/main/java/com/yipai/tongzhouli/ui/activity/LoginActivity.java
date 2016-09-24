package com.yipai.tongzhouli.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.ui.adapter.LoginAdapter;
import com.yipai.tongzhouli.ui.fragment.LoginFragment;
import com.yipai.tongzhouli.ui.fragment.RegistFragment;
import com.yipai.tongzhouli.ui.widget.CustomViewPager;

import java.util.ArrayList;

/**
 *  Created by moram on 2016/9/21
 */
public class LoginActivity extends BaseActivity  {


    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;
    private ImageView closeIV;
    private TabLayout tabLayout;
    private CustomViewPager viewPager;
    private LoginAdapter homeAdapter;



    @Override
    protected void initData() {
        fragments = new ArrayList<>();
        fragments.add(new LoginFragment());
        fragments.add(new RegistFragment());
        titles = new ArrayList<>();
        titles.add(getStringRes(R.string.login));
        titles.add(getStringRes(R.string.register));
    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void initView() {

        closeIV=(ImageView)findViewById(R.id.iv_close);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (CustomViewPager)findViewById(R.id.viewpager);

    }

    @Override
    protected void initEvent() {
        closeIV.setOnClickListener(this);
        viewPager.setPagingEnabled(false);
        homeAdapter = new LoginAdapter(getSupportFragmentManager(), fragments, titles);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        for(int i = 0; i < titles.size(); i ++){
            tabLayout.addTab(tabLayout.newTab().setText(titles.get(i)));
        }
        viewPager.setAdapter(homeAdapter);
        tabLayout.setupWithViewPager(viewPager);//绑定 ViewPager 和tabLayout
    }

    @Override
    protected void onClick(int resId) {
        switch(resId){

            case R.id.iv_close:
                finish();

                break;



        }
    }


}

