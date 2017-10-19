package org.faqrobot.text_peng.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.faqrobot.text_peng.R;
import org.faqrobot.text_peng.mvp_api.GetInfo_P;
import org.faqrobot.text_peng.mvp_p.Mvp_persent;

public class MainActivity extends AppCompatActivity implements GetInfo_P{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview);
        /**注意这里传的this，我自己的理解就是（本来传入接口，但是activity实现接口，本身可以当做接口传参）*/
        Mvp_persent.getInstance(this);
    }


    @Override
    public void show_Info(final String txt) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textView.setText(txt);
            }
        });
    }
}
