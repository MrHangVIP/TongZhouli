package com.yipai.tongzhouli.api;

import com.yipai.tongzhouli.bean.User;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by moram on 2016/11/2.
 */
public interface LoginService {

    @GET("LogionServlet")
    Call<User> login(@Query("userName") String userName,@Query("passWord") String passWord);

    @GET("LogionServlet")
    Call<User> login(@QueryMap Map<String ,String > mapParams);

    @POST("LoginServlet")
    Call<User> login(@Body User user);

//    @POST("LoginServlet")
//    Call<User> login(@Field("userName") String userName,@Field("passWord") String passWord);
//
//    @POST("LoginServlet")
//    Call<User> login(@FieldMap Map<String,String> mapParams);

}
