package org.faqrobot.text_peng.mvp_p;

import android.util.Log;

import org.faqrobot.text_peng.base_rxjava.Base_Okhttp_Rxjava;
import org.faqrobot.text_peng.entity.MyBean;
import org.faqrobot.text_peng.mvp_api.GetInfo_P;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 孟晨 on 2017/10/10.
 */

public class Mvp_persent {

    public Subscription getInfo_retrofit;
    private GetInfo_P getInfo_p;


    private static Mvp_persent mvp_persent;
    /**单例后，外部将接口传入进来（比如activity实现了接口，传入activity，就等于传入了接口）*/
    public static Mvp_persent getInstance(GetInfo_P getInfo_p){
        if(mvp_persent==null){
            mvp_persent = new Mvp_persent(getInfo_p);
        }
        return mvp_persent;
    }

    private Mvp_persent(final GetInfo_P getInfo_p){
        getInfo_retrofit= Base_Okhttp_Rxjava.getInstance().geterver().getSearchBook("金瓶梅", null, 0, 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MyBean>(){
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                        Log.e("_______onError_______: ", e.toString());
                    }
                    @Override
                    public void onNext(MyBean myBean) {
                        /**这里可以直接更新ui，不需要runonuithread*/
                        Log.e("_______onNext_______: ","OK" );
                        getInfo_p.show_Info(myBean.getCount()+"");
                    }
                });
    }
}
