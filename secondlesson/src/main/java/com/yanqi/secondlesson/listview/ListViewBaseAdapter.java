package com.yanqi.secondlesson.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yanqi.secondlesson.R;

import java.util.List;

/**
 * author : yanqi
 * date   : 2019-08-13 19:55
 */

public class ListViewBaseAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mData;

    public ListViewBaseAdapter(Context context, List<String> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public String getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_view, null);
        TextView textView = view.findViewById(R.id.tv_list_view);
        textView.setText(mData.get(position));
        return view;
    }

}
