package org.faqrobot.text_peng.base_rxjava;

import org.faqrobot.text_peng.app.MApplication;
import org.faqrobot.text_peng.constants.Config;
import org.faqrobot.text_peng.net_api.MyApi;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 孟晨 on 2017/10/10.
 */

public class Base_Okhttp_Rxjava {

    private static final int DEFAULT_TIMEOUT = 3;
    private OkHttpClient okHttpClient;
    private MyApi rxjava_api;

    /**在访问HttpMethods时创建单例——通过静态内部类去实例化类*/
    private static class SingletonHolder {
        private static final Base_Okhttp_Rxjava INSTANCE = new Base_Okhttp_Rxjava();
    }

    /**单例*/
    public static Base_Okhttp_Rxjava getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private Base_Okhttp_Rxjava(){
        File cacheFile = new File(MApplication.getContext().getCacheDir(), "response");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100);
        /**拦截器*/
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        /**共用okhttp*/
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .cache(cache)
                .build();

        /**共用Retrofit*/
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(Config.BASEURL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        rxjava_api = mRetrofit.create(MyApi.class);
    }

    /**对外提供获取接口对象的方法*/
    public MyApi geterver() {
        return rxjava_api;
    }

}
