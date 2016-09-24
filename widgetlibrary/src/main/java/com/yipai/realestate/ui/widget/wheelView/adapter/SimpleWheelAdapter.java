package com.yipai.realestate.ui.widget.wheelView.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.yipai.realestate.ui.widget.wheelView.common.WheelData;
import com.yipai.realestate.ui.widget.wheelView.WheelItem;

/**
 * 滚轮图片和文本适配器
 */
public class SimpleWheelAdapter extends BaseWheelAdapter<WheelData> {

    private Context mContext;

    public SimpleWheelAdapter(Context context) {
        mContext = context;
    }

    @Override
    public View bindView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = new WheelItem(mContext);
        }
        WheelItem item = (WheelItem) convertView;
        item.setImage(mList.get(position).getId());
        item.setText(mList.get(position).getName());
        return convertView;
    }

}
