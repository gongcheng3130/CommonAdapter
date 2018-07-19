package com.cheng.commonadapter;

import android.support.annotation.IdRes;
import android.util.SparseArray;
import android.view.View;

public class BaseViewHolder {

    private SparseArray<View> views;
    private View item;

    public BaseViewHolder(View v){
        views = new SparseArray<>();
        this.item = v;
    }

    public <T extends View> T getView(@IdRes int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = item.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }

    public void setViewVisible(@IdRes int viewId, int visible){
        getView(viewId).setVisibility(visible);
    }

    public void setViewEnable(@IdRes int viewId, boolean enable){
        getView(viewId).setEnabled(enable);
    }

    public View getConvertView() {
        return item;
    }

}
