package com.yipai.tongzhouli.ui.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.AnimRes;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntegerRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.yipai.tongzhouli.R;


/**
 * Created by normal on 2016/09/21.
 * activity 基类
 */
public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
	public static final String str_bundle = "bundle";
	public Toolbar toolbar;
	public TextView toolbarTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initData();
		setView();
		setToolbar();
		initView();
		initEvent();
	}

	private void setToolbar() {
		toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbarTitle = (TextView) findViewById(R.id.toolbar_title);
		if (toolbar != null && toolbarTitle != null) {
			toolbar.setNavigationIcon(setBackIcon());
			toolbar.setNavigationOnClickListener(setBackClick());
		}
	}

	/**
	 * 设置返回按钮图标
	 *
	 * @return 按钮图标
	 */
	public Drawable setBackIcon() {
		return getDrawableRes(R.drawable.back_toolbar);
	}

	/**
	 * 设置返回按钮监听
	 *
	 * @return 按钮监听
	 */
	public View.OnClickListener setBackClick() {
		return new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				onBackPressed();
			}
		};
	}

	@Override
	protected void onTitleChanged(CharSequence title, int color) {
		super.onTitleChanged(title, color);
		if (toolbarTitle != null) {
			toolbarTitle.setText(title);
		}
	}

	/**
	 * 屏幕90°横屏
	 * */
	public void rotate90() {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		setFullScreen(true);
	}

	/**
	 * 屏幕自动（90，270）横屏
	 * */
	public void rotateAutoLandscape() {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
	}

	/**
	 * 屏幕竖屏
	 * */
	public void rotate0() {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setFullScreen(false);
	}

	public void setFullScreen(boolean isFullScreen) {
		if (isFullScreen) {
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//			getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
		} else {
//			getWindow().addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
			getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		}
	}

	/**
	 * 页面切换，含参数
	 *
	 * @param mClass
	 * @param bundle
	 */
	protected void jumpToNext(Class<?> mClass, Bundle bundle) {
		jumpToNext(mClass, bundle, 0);
	}

	/**
	 * 页面切换，含参数
	 *
	 * @param mClass
	 * @param bundle
	 */
	protected void jumpToNext(Class<?> mClass, Bundle bundle, @AnimRes int resId) {
		Intent intent = new Intent(this, mClass);
		if (bundle != null)
			intent.putExtra(str_bundle, bundle);
		startActivity(intent);
		overridePendingTransition(resId, 0);
	}

	/**
	 * 页面切换，不含参数
	 *
	 * @param mClass
	 */
	protected void jumpToNext(Class<?> mClass) {
		jumpToNext(mClass, null);
	}

	/**
	 * 页面切换，不含参数
	 *
	 * @param mClass
	 */
	protected void jumpToNext(Class<?> mClass, @AnimRes int resId) {
		jumpToNext(mClass, null, resId);
	}

	/**
	 * 页面切换，含参数，并且将当前页面关闭
	 *
	 * @param mClass
	 * @param bundle
	 */
	protected void goToNext(Class<?> mClass, Bundle bundle) {
		jumpToNext(mClass, bundle);
		finish();
	}

	/**
	 * 页面切换，含参数，并且将当前页面关闭
	 *
	 * @param mClass
	 * @param bundle
	 */
	protected void goToNext(Class<?> mClass, Bundle bundle, @AnimRes int resId) {
		jumpToNext(mClass, bundle, resId);
		finish();
	}

	/**
	 * 页面切换，不含参数，并且将原页面关闭
	 *
	 * @param mClass
	 */
	public void goToNext(Class<?> mClass) {
		goToNext(mClass, null, 0);
	}

	/**
	 * 页面切换，不含参数，并且将原页面关闭
	 *
	 * @param mClass
	 */
	public void goToNext(Class<?> mClass, @AnimRes int resId) {
		goToNext(mClass, null, resId);
	}

	protected String getStringRes(@StringRes int resId) {
		return getResources().getString(resId);
	}

	protected int getIntegerRes(@IntegerRes int resId) {
		return getResources().getInteger(resId);
	}

	protected float getFloatRes(@DimenRes int resId) {
		return getResources().getDimension(resId);
	}

	protected int getColorRes(@ColorRes int resId) {
		final int version = Build.VERSION.SDK_INT;
		if (version >= 23) {
			return ContextCompat.getColor(this, resId);
		} else {
			return getResources().getColor(resId);
		}
	}

	protected Drawable getDrawableRes(@DrawableRes int resId) {
		final int version = Build.VERSION.SDK_INT;
		if (version >= 23) {
			return ContextCompat.getDrawable(this, resId);
		} else {
			return getResources().getDrawable(resId);
		}
	}

	protected int getStatusBarHeight() {
		int result = 0;
		int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
		if (resourceId > 0) {
			result = getResources().getDimensionPixelSize(resourceId);
		}
		return result;
	}

	protected void toast(String msg) {
		Toast.makeText(this, msg + "", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onClick(View v) {
		onClick(v.getId());
	}

	@Override
	public void finish() {
		super.finish();
		overridePendingTransition(0, 0);
	}

	protected abstract void initData();

	protected abstract void setView();

	protected abstract void initView();

	protected abstract void initEvent();

	protected abstract void onClick(int resId);
}
