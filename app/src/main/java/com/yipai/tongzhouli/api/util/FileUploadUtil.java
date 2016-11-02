package com.yipai.tongzhouli.api.util;

import android.content.Context;
import android.net.Uri;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Created by moram on 2016/11/2.
 */
public class FileUploadUtil {

    public static final String MULTIPART_FORM_DATA="multipart/form-data";

    public static RequestBody createPartFormString(String description){

        return RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA),description);
    }

    public MultipartBody.Part getFilePart(Context context,String partName, File uploadFile){

        RequestBody requestBody=RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA),uploadFile);

        return MultipartBody.Part.createFormData(partName,uploadFile.getName(),requestBody);

    }

}
