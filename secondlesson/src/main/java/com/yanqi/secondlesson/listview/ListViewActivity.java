package com.yanqi.secondlesson.listview;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.yanqi.secondlesson.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView mListView;
    private ListViewAdapter mAdapter;
    private ListViewProAdapter mProAdapter;
    private ListViewBaseAdapter mBaseAdapter;
    private Button mAddBtn, mDelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mListView = findViewById(R.id.listview);
        mAddBtn = findViewById(R.id.btn_add);
        mDelBtn = findViewById(R.id.btn_del);
        mAdapter = new ListViewAdapter(this, makeData());
        mProAdapter = new ListViewProAdapter(this, makeData());
        mBaseAdapter = new ListViewBaseAdapter(this, makeData());
//        mListView.setAdapter(mBaseAdapter);
//        mListView.setAdapter(mAdapter);
        mListView.setAdapter(mProAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "点击了第" + position + "个", Toast.LENGTH_LONG).show();
            }
        });
        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mProAdapter != null) {
                    mProAdapter.addItem("我市新增的");
                }
            }
        });
        mDelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mProAdapter != null) {
                    mProAdapter.delItem();
                }
            }
        });
    }

    private List<String> makeData() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add(i + "");
        }
        return data;
    }

}
