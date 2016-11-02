package com.yipai.tongzhouli.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.api.LoginService;
import com.yipai.tongzhouli.bean.User;
import com.yipai.tongzhouli.ui.activity.ForgetPassActivity;
import com.yipai.tongzhouli.ui.widget.MyFontTextView;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.douban.com/v2/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                LoginService service = retrofit.create(LoginService.class);

                Call<User> call=service.login("aaa","123");
                //------------------------------- //同步请求，注意需要在子线程中
                try {
                    User response = call.execute().body();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //------------------------------//异步请求
                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {

                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                    }
                });


                break;


            case R.id.tv_forget_pass:
                jumpToNext(ForgetPassActivity.class);
                break;
        }
    }
}
