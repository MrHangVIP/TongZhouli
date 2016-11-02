package com.yipai.tongzhouli.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by moram on 2016/9/21.
 * 自定义字体textview
 */
public class MyFontTextView extends TextView{

    private Context mContext;
    private Typeface typeFace;
    public MyFontTextView(Context context) {
        super(context);
        mContext=context;
        setFont();
    }

    public MyFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext=context;
        setFont();
    }

    public MyFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext=context;
        setFont();
    }

    private void setFont(){
//        typeFace = Typeface.createFromAsset(mContext.getAssets(), "font/new_Song.ttf");
//        this.setTypeface(typeFace);
    }
}
