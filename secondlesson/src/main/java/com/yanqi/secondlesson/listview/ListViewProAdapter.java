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
 * date   : 2019-08-13 18:42
 */
public class ListViewProAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> mData;

    public ListViewProAdapter(Context context, List<String> data) {
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
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list_view, null);
            viewHolder.title = convertView.findViewById(R.id.tv_list_view);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.title.setText(mData.get(position));
        return convertView;
    }

    public void addItem(String text) {
        mData.add(text);
        notifyDataSetChanged();
    }

    public void delItem() {
        mData.remove(mData.size() - 1);
        notifyDataSetChanged();
    }

    static class ViewHolder {
        TextView title;
    }
}
