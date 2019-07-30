package com.yanqi.firstlesson.layout;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.yanqi.firstlesson.R;

/**
 * author : yanqi
 * date   : 2019-07-29 21:35
 */
public class LayoutActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
    }
}
