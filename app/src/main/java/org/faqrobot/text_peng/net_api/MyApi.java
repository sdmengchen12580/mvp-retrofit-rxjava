package org.faqrobot.text_peng.net_api;

import org.faqrobot.text_peng.entity.MyBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by 孟晨 on 2017/10/10.
 */

public interface MyApi {
    @GET("book/search")
    Observable<MyBean> getSearchBook(@Query("q") String name,
                                     @Query("tag") String tag,
                                     @Query("start") int start,
                                     @Query("count") int count);
}
