package com.yipai.realestate.ui.widget.wheelView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

import com.yipai.realestate.ui.widget.wheelView.common.WheelConstants;

/**
 * 嵌套ScrollView
 *
 * @author venshine
 */
public class NestedScrollView extends ScrollView {

    public NestedScrollView(Context context) {
        super(context);
        init();
    }

    public NestedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                WheelView wv = (WheelView) findViewWithTag(WheelConstants.TAG);
                if (wv != null) {
                    wv.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        });
    }


}
