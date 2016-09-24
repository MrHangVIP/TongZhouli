package com.yipai.realestate.ui.widget.wheelView.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.yipai.realestate.ui.widget.wheelView.WheelItem;

/**
 * 滚轮数组适配器
 */
public class ArrayWheelAdapter<T> extends BaseWheelAdapter<T> {

    private Context mContext;

    public ArrayWheelAdapter(Context context) {
        mContext = context;
    }

    @Override
    public View bindView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = new WheelItem(mContext);
        }
        WheelItem wheelItem = (WheelItem) convertView;
        T item = getItem(position);
        if (wheelItem instanceof CharSequence) {
            wheelItem.setText((CharSequence) item);
        } else {
            wheelItem.setText(item.toString());
        }
        return convertView;
    }

}
