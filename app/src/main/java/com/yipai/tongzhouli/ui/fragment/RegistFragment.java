package com.yipai.tongzhouli.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.yipai.tongzhouli.R;

/**
 * Created by moram on 2016/9/21.
 */
public class RegistFragment extends BaseFragment{
    private View view;
    private EditText phoneNumberET;
    private EditText passwordET;
    private EditText checkCodeET;



    @Override
    protected View getLayout(LayoutInflater inflater, ViewGroup container) {
        view=inflater.inflate(R.layout.fragment_regist,container,false);

        return view;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View view) {
        phoneNumberET=(EditText)view.findViewById(R.id.et_username);
        checkCodeET=(EditText)view.findViewById(R.id.et_check_code);
        passwordET=(EditText)view.findViewById(R.id.et_password);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.bt_regist:

                break;

            case R.id.bt_send:

                break;

        }
    }
}
