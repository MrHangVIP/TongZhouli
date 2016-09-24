package com.yipai.tongzhouli.ui.activity;

import android.widget.ImageView;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.ui.widget.MyFontTextView;

/**
 * Created by moram on 2016/9/22.
 */
public class ScenicAreaActivity extends BaseActivity  {


    private ImageView oneVideoIV,twoVideoIV,threeVideoIV;

    @Override
    protected void initData() {

    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_scenic_area);
    }

    @Override
    protected void initView() {
        setTitle("虚拟景区");

        oneVideoIV=(ImageView)findViewById(R.id.iv_vodeo_one);
        twoVideoIV=(ImageView)findViewById(R.id.iv_vodeo_two);
        threeVideoIV=(ImageView)findViewById(R.id.iv_vodeo_three);


    }

    @Override
    protected void initEvent() {
        oneVideoIV.setOnClickListener(this);
        twoVideoIV.setOnClickListener(this);
        threeVideoIV.setOnClickListener(this);

    }

    @Override
    protected void onClick(int resId) {
        switch(resId){

            case R.id.iv_vodeo_one:
                jumpToNext(LoginActivity.class);;

                break;

            case R.id.iv_vodeo_two:

                break;

            case R.id.iv_vodeo_three:

                break;



        }
    }


}

