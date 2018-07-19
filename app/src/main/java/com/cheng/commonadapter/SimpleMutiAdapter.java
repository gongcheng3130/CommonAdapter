package com.cheng.commonadapter;

import android.content.Context;
import android.widget.TextView;
import java.util.List;

public class SimpleMutiAdapter extends CommonMutiAdapter<String>{

    public SimpleMutiAdapter(Context context, List<String> lists) {
        super(context, lists);
    }

    @Override
    public int getItemTypeCount() {
        return 2;
    }

    @Override
    public int getItemType(int position) {
        return position < 5 ? 0 : 1;
    }

    @Override
    public int getLayout(int position) {
        return R.layout.item_simple;
    }

    @Override
    public void setLayoutInfo(BaseViewHolder holder, int position) {
        if(getItemType(position)==0){
            holder.<TextView>getView(R.id.simple_tv).setText("第一种布局 --- " + lists.get(position));
        }else{
            holder.<TextView>getView(R.id.simple_tv).setText("第二种布局 --- " + lists.get(position));
        }
    }

    @Override
    public void setLayoutClick(BaseViewHolder holder, int position) {

    }

}
