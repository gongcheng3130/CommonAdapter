package com.cheng.commonadapter;

import android.content.Context;

import java.util.List;

public abstract class CommonMutiAdapter<T> extends CommonAdapter<T> {

    public CommonMutiAdapter(Context context, List<T> lists){
        super(context, lists);
    }

    @Override
    public int getViewTypeCount() {
        return getItemTypeCount();
    }

    @Override
    public int getItemViewType(int position) {
        return getItemType(position);
    }

    public abstract int getItemTypeCount();

    public abstract int getItemType(int position);

}
