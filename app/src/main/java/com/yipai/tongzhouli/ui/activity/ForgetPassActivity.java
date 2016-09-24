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
public class ForgetPassActivity extends BaseActivity  {


    private EditText phoneNumberET ,checkCodeET ;
    private MyFontButton nextBT;

    @Override
    protected void initData() {

    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_forget_pass);
    }

    @Override
    protected void initView() {
        setTitle("忘记密码");

        phoneNumberET=(EditText)findViewById(R.id.et_username);
        checkCodeET=(EditText)findViewById(R.id.et_check_code);
        nextBT=(MyFontButton)findViewById(R.id.bt_next);
    }

    @Override
    protected void initEvent() {
        nextBT.setOnClickListener(this);

    }

    @Override
    protected void onClick(int resId) {
        switch(resId){

            case R.id.bt_send:

                break;

            case R.id.bt_next:
                jumpToNext(UpdatePassActivity.class);
                finish();
                break;



        }
    }


}

