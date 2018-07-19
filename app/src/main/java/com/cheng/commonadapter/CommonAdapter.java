package com.cheng.commonadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public abstract class CommonAdapter<T> extends BaseAdapter {

    protected Context context;
    protected LayoutInflater inflater;
    protected List<T> lists;

    public CommonAdapter(Context context, List<T> lists){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists==null ? 0 : lists.size();
    }

    @Override
    public T getItem(int position) {
        return lists==null ? null : lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lists==null ? -1 : position;
    }

    public void setList(List<T> lists){
        this.lists = lists;
        if(this.lists==null){
            this.lists = new ArrayList<>();
        }
        notifyDataSetChanged();
    }

    public void addList(List<T> lists){
        if(this.lists!=null){
            this.lists.addAll(lists);
        }else{
            this.lists = lists;
        }
        if(this.lists==null){
            this.lists = new ArrayList<>();
        }
        notifyDataSetChanged();
    }

    public void remove(int index){
        if(lists!=null){
            lists.remove(index);
            notifyDataSetChanged();
        }
    }

    public List<T> getLists(){
        return lists;
    }

    public void clear(){
        if(lists!=null)lists.clear();
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaseViewHolder holder;
        if(convertView == null){
            convertView = inflater.inflate(getLayout(position), null);
            holder = new BaseViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (BaseViewHolder) convertView.getTag();
        }
        setLayoutInfo(holder, position);
        setLayoutClick(holder, position);
        return convertView;
    }

    public abstract int getLayout(int position);

    public abstract void setLayoutInfo(BaseViewHolder holder, int position);

    public abstract void setLayoutClick(BaseViewHolder holder, int position);

}
