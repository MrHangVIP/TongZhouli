package com.yipai.tongzhouli.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by moram on 2016/9/21.
 * 自定义字体的button
 */
public class MyFontButton extends Button{

    private Context mContext;
    private Typeface typeFace;
    public MyFontButton(Context context) {
        super(context);
        mContext=context;
        setFont();
    }

    public MyFontButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext=context;
        setFont();
    }

    public MyFontButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext=context;
        setFont();
    }

    private void setFont(){
        typeFace = Typeface.createFromAsset(mContext.getAssets(), "font/new_Song.ttf");
        this.setTypeface(typeFace);
    }
}
