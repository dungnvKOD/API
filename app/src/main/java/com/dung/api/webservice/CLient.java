package com.dung.api.webservice;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CLient {//cau hinh retrofit cho retrofit biet tro den dau ,retrofit no impliment Service
    private static final String BASE_URL = "http://dummy.restapiexample.com/";

    private static Service service;

    public static Service getService() {
        if (service == null) {
            new CLient();//de khoi tao sevice
        }
        return service;
    }

    private CLient() {

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)//quy dinh thoi gian client conect den server,qua thoi gian la huy
                .readTimeout(10, TimeUnit.SECONDS);//thoi gian cho du lieu ve


        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(BASE_URL) //chi dinh phan dau api la gi
                .client(clientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create()); //dung gson
        service = builder.build().create(Service.class);
    }
}
