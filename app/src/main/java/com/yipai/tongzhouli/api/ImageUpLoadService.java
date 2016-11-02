package com.yipai.tongzhouli.api;

import java.io.File;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by moram on 2016/11/2.
 */
public interface ImageUpLoadService {

    @Multipart
    @POST("ImageUpLoadServlet")
    Call<String> upLoadImage(@Part ("description")RequestBody request, @Part MultipartBody.Part imageFile);


}
