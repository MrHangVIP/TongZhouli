package com.yipai.tongzhouli.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.ui.activity.ForgetPassActivity;
import com.yipai.tongzhouli.ui.widget.MyFontTextView;

/**
 * Created by moram on 2016/9/21.
 */
public class LoginFragment extends BaseFragment{

    private View view;
    private EditText phoneNumberET;
    private EditText passwordET;
    private MyFontTextView frogetPassTV;



    @Override
    protected View getLayout(LayoutInflater inflater, ViewGroup container) {
        view=inflater.inflate(R.layout.fragment_login,container,false);

        return view;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View view) {
        phoneNumberET=(EditText)view.findViewById(R.id.et_username);
        passwordET=(EditText)view.findViewById(R.id.et_password);
        frogetPassTV=(MyFontTextView)view.findViewById(R.id.tv_forget_pass);
    }

    @Override
    protected void initEvent() {
        frogetPassTV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.bt_login:

                break;


            case R.id.tv_forget_pass:
                jumpToNext(ForgetPassActivity.class);
                break;
        }
    }
}
