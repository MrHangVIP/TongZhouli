package com.yipai.tongzhouli.ui.activity;

import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.yipai.tongzhouli.R;
import com.yipai.tongzhouli.util.ShareUtil;


/**
 * Created by moram on 2016/9/21
 * note:
 * 欢迎页面
 */
public class WelcomeActivity extends BaseActivity implements Animation.AnimationListener {
	private String str_first = "str_first";
	ImageView iv_icon;

	@Override
	protected void initData() {

	}

	@Override
	protected void setView() {
		setContentView(R.layout.activity_welcome);
	}

	protected void initView() {
		iv_icon = (ImageView) findViewById(R.id.iv_icon);

	}

	protected void initEvent() {
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.welcome_alpha);
		animation.setFillAfter(true);
		iv_icon.startAnimation(animation);
		animation.startNow();
		animation.setAnimationListener(this);

	}
	private Handler mHandler = new Handler(){
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
		}
	};
	@Override
	protected void onClick(int resId) {

	}

	@Override
	public void onAnimationStart(Animation animation) {

	}

	@Override
	public void onAnimationEnd(Animation animation) {
//		goToNext(MainActivity.class);
		ShareUtil shareUtil = new ShareUtil();
		boolean notFirst = shareUtil.getBoolean(this, str_first);
		if(notFirst){
			goToNext(MainActivity.class);
		}else{
			shareUtil.saveBoolean(this, str_first, true);
			goToNext(MainActivity.class);
		}
	}

	@Override
	public void onAnimationRepeat(Animation animation) {

	}

}
