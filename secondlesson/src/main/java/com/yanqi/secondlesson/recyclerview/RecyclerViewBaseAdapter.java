package com.yanqi.secondlesson.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yanqi.secondlesson.R;

import java.util.List;

/**
 * author : yanqi
 * date   : 2019-08-13 20:02
 */
public class RecyclerViewBaseAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context mContext;
    private List<String> mData;

    public RecyclerViewBaseAdapter(Context context, List<String> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_list_view, null));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mTv.setText(mData.get(position));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void add(String item) {
        mData.add(mData.size() / 2, item);
        notifyItemInserted(mData.size() / 2);
    }

    public void del() {
        mData.remove(mData.size() - 1);
        notifyItemRemoved(mData.size() - 1);
    }
}
