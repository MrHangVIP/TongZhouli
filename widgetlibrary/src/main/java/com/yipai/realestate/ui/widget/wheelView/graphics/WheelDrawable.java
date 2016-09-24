package com.yipai.realestate.ui.widget.wheelView.graphics;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

import com.yipai.realestate.ui.widget.wheelView.common.WheelConstants;
import com.yipai.realestate.ui.widget.wheelView.WheelView;

/**
 * 滚轮样式
 *
 * @author venshine
 */
public class WheelDrawable extends Drawable {

    protected int mWidth;   // 控件宽

    protected int mHeight;  // 控件高

    protected WheelView.WheelViewStyle mStyle;

    private Paint mBgPaint;

    public WheelDrawable(int width, int height, WheelView.WheelViewStyle style) {
        mWidth = width;
        mHeight = height;
        mStyle = style;
        init();
    }

    private void init() {
        mBgPaint = new Paint();
        mBgPaint.setColor(mStyle.backgroundColor != -1 ? mStyle.backgroundColor : WheelConstants.WHEEL_BG);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(0, 0, mWidth, mHeight, mBgPaint);
    }

    @Override
    public void setAlpha(int alpha) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public int getOpacity() {
        return 0;
    }
}
