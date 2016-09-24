package com.yipai.tongzhouli.ui.activity;

import android.widget.EditText;
import android.widget.ImageView;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.ui.widget.MyFontButton;

/**
 * A login screen that offers login via email/password.
 */
public class MainActivity extends BaseActivity  {


    private ImageView shareIV,settingIV,scenicPointIV,bestSellingIV,reservationIV,scenicVideoIV,navigationIV;


    @Override
    protected void initData() {

    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        shareIV=(ImageView)findViewById(R.id.iv_share);
        settingIV=(ImageView)findViewById(R.id.iv_setting);
        scenicPointIV=(ImageView)findViewById(R.id.iv_scenic_spot);
        bestSellingIV=(ImageView)findViewById(R.id.iv_best_selling);
        reservationIV=(ImageView)findViewById(R.id.iv_reservation);
        scenicVideoIV=(ImageView)findViewById(R.id.iv_virtual_reality);
        navigationIV=(ImageView)findViewById(R.id.iv_navigation);



    }

    @Override
    protected void initEvent() {
        shareIV.setOnClickListener(this);
        settingIV.setOnClickListener(this);
        scenicPointIV.setOnClickListener(this);
        bestSellingIV.setOnClickListener(this);
        reservationIV.setOnClickListener(this);
        scenicVideoIV.setOnClickListener(this);
        navigationIV.setOnClickListener(this);
    }

    @Override
    protected void onClick(int resId) {
        switch(resId){
            case R.id.iv_share:

                break;

            case R.id.iv_setting:
                jumpToNext(SettingActivity.class);
                break;

            case R.id.iv_scenic_spot:
                jumpToNext(ScenicIntroductionActivity.class);
                break;

            case R.id.iv_best_selling:

                break;

            case R.id.iv_reservation:
                jumpToNext(ReservationActivity.class);
                break;

            case R.id.iv_virtual_reality:
                jumpToNext(ScenicAreaActivity.class);
                break;

            case R.id.iv_navigation:

                break;

        }
    }


}

