package com.cheng.commonadapter;

import android.content.Context;
import android.widget.TextView;
import java.util.List;

public class SimpleAdapter extends CommonAdapter<String>{

    public SimpleAdapter(Context context, List<String> lists) {
        super(context, lists);
    }

    @Override
    public int getLayout(int position) {
        return R.layout.item_simple;
    }

    @Override
    public void setLayoutInfo(BaseViewHolder holder, int position) {
        holder.<TextView>getView(R.id.simple_tv).setText(lists.get(position));
    }

    @Override
    public void setLayoutClick(BaseViewHolder holder, int position) {

    }

}
