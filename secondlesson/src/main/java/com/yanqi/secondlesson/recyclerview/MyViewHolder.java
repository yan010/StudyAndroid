package com.yanqi.secondlesson.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yanqi.secondlesson.R;

/**
 * author : yanqi
 * date   : 2019-08-13 20:14
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView mTv;
    public View mView;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;
        mTv = mView.findViewById(R.id.tv_list_view);
    }
}
