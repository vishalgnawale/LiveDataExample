package com.demo.demo_application.service.modal.repository;



import android.content.Context;

import com.demo.demo_application.BuildConfig;
import com.demo.demo_application.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {



    private static Retrofit retrofit=null;
    public  static RestApiService getApiService(){
        if(retrofit ==null){
            retrofit =new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(RestApiService.class);

    }
}
