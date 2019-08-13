package com.yanqi.studyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.yanqi.firstlesson.java.AndroidRd;
import com.yanqi.firstlesson.java.ClientRd;
import com.yanqi.firstlesson.java.JavaActivity;
import com.yanqi.firstlesson.java.Rd;
import com.yanqi.firstlesson.layout.LayoutActivity;
import com.yanqi.firstlesson.widget.WidgetActivity;
import com.yanqi.secondlesson.listview.ListViewActivity;
import com.yanqi.secondlesson.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {
    private TextView javaTv, layoutTv, widgetTv, listViewTv, recyclerViewTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        javaTv = findViewById(R.id.btn_java);
        layoutTv = findViewById(R.id.btn_android_layout);
        widgetTv = findViewById(R.id.btn_android_widget);
        listViewTv = findViewById(R.id.btn_android_list_view);
        recyclerViewTv = findViewById(R.id.btn_android_recycler_view);
        javaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JavaActivity.class);
                startActivity(intent);
            }
        });
        layoutTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
                startActivity(intent);
            }
        });
        widgetTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WidgetActivity.class);
                startActivity(intent);
            }
        });
        listViewTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
        recyclerViewTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
