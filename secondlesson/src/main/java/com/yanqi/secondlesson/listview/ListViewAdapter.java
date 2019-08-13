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
 * date   : 2019-08-13 18:08
 */
public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mData;

    public ListViewAdapter(Context context, List<String> data) {
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
    public int getItemViewType(int position) {
        if (position % 2 == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        switch (getItemViewType(position)) {
            case 1:
                convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list_view, null);
                TextView textView = convertView.findViewById(R.id.tv_list_view);
                textView.setText(mData.get(position));
                break;
            case 0:
            default:
                convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list_view_right, null);
//                TextView textView2 = convertView.findViewById(R.id.tv_list_view);
//                textView2.setText(mData.get(position));
                break;
        }

        return convertView;
    }

}
