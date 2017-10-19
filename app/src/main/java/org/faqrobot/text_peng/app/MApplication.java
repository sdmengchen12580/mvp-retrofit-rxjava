package org.faqrobot.text_peng.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by 孟晨 on 2017/10/10.
 */

public class MApplication  extends Application{
    private static Context mContext;
    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
