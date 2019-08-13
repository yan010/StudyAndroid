package com.yanqi.firstlesson.java;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.yanqi.firstlesson.R;

/**
 * author : yanqi
 * date   : 2019-07-29 16:25
 */
public class JavaActivity extends Activity {
    private TextView rdTv, rdTv2, rdTv3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        rdTv = findViewById(R.id.tv_rd1);
        rdTv2 = findViewById(R.id.tv_rd2);
        rdTv3 = findViewById(R.id.tv_rd3);
        Rd androidRd = new AndroidRd(false);
        rdTv.setText("androidRd说：" + androidRd.code("aa"));
        Rd clientRd = new ClientRd(false);
        rdTv2.setText("clientRd说：" + clientRd.code("aaa"));
        Rd rd3 = new Rd(false,true);
        rdTv3.setText("Rd说：" + rd3.code("aaa"));
    }
}
