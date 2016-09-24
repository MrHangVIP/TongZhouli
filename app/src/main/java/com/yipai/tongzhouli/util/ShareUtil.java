package com.yipai.tongzhouli.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by normal on 2016/09/21.
 * 本地数据保存和查询的工具类
 */
public class ShareUtil {
	public final String shareName = "share";
	public final int defaultValueInt = -1;
	public final String defaultValueStr = "";

	/**
	 * 初始化sharepreference数据库
	 *
	 * @param mContext
	 * @return
	 */
	public SharedPreferences initShare(Context mContext) {
		return mContext.getSharedPreferences(shareName, Context.MODE_PRIVATE);
	}

	/**
	 * 初始化sharepreference数据库
	 *
	 * @param mContext
	 * @param shareName
	 * @return
	 */
	public SharedPreferences initShare(Context mContext, String shareName) {
		return mContext.getSharedPreferences(shareName, Context.MODE_PRIVATE);
	}

	/**
	 * 保存int类型的数据
	 *
	 * @param mContext
	 * @param shareName
	 * @param key
	 * @param value
	 */
	public void saveInteger(Context mContext, String shareName, String key, int value) {
		SharedPreferences preferences = initShare(mContext, shareName);
		preferences.edit().putInt(key, value).commit();
	}

	public void saveInteger(Context mContext, String key, int value) {
		SharedPreferences preferences = initShare(mContext);
		preferences.edit().putInt(key, value).commit();
	}

	/**
	 * 保存字符串类型的数据
	 *
	 * @param mContext
	 * @param shareName
	 * @param key
	 * @param value
	 */
	public void saveString(Context mContext, String shareName, String key, String value) {
		SharedPreferences preferences = initShare(mContext, shareName);
		preferences.edit().putString(key, value).commit();
	}

	public void saveString(Context mContext, String key, String value) {
		SharedPreferences preferences = initShare(mContext, shareName);
		preferences.edit().putString(key, value).commit();
	}

	/**
	 * 获取int类型的数据
	 *
	 * @param mContext
	 * @param shareName
	 * @param key
	 * @return
	 */
	public int getIntegerDefault(Context mContext, String shareName, String key) {
		SharedPreferences preferences = initShare(mContext, shareName);
		return preferences.getInt(key, defaultValueInt);
	}

	public int getInteger(Context mContext, String shareName, String key, int defaultValueInt) {
		SharedPreferences preferences = initShare(mContext, shareName);
		return preferences.getInt(key, defaultValueInt);
	}

	public int getIntegerDefault(Context mContext, String key, int defaultValueInt) {
		SharedPreferences preferences = initShare(mContext);
		return preferences.getInt(key, defaultValueInt);
	}

	public int getInteger(Context mContext, String key) {
		SharedPreferences preferences = initShare(mContext);
		return preferences.getInt(key, defaultValueInt);
	}

	/**
	 * 获取字符串类型的数据
	 *
	 * @param mContext
	 * @param shareName
	 * @param key
	 * @param defaultValueStr
	 * @return
	 */
	public String getStringDefault(Context mContext, String shareName, String key, String defaultValueStr) {
		SharedPreferences preferences = initShare(mContext, shareName);
		return preferences.getString(key, defaultValueStr);
	}

	public String getString(Context mContext, String shareName, String key) {
		SharedPreferences preferences = initShare(mContext, shareName);
		return preferences.getString(key, defaultValueStr);
	}

	public String getStringDefault(Context mContext, String key, String defaultValueStr) {
		SharedPreferences preferences = initShare(mContext);
		return preferences.getString(key, defaultValueStr);
	}

	public String getString(Context mContext, String key) {
		SharedPreferences preferences = initShare(mContext);
		return preferences.getString(key, defaultValueStr);
	}

	/**
	 * 获取boolean类型的数据
	 * @param mContext
	 * @param key
     * @return
     */
	public boolean getBoolean(Context mContext, String key) {
		SharedPreferences preferences = initShare(mContext);
		return preferences.getBoolean(key, false);
	}

	/**
	 * 保存boolean类型的数据
	 * @param mContext
	 * @param key
	 * @param value
     */
	public void saveBoolean(Context mContext, String key, boolean value) {
		SharedPreferences preferences = initShare(mContext, shareName);
		preferences.edit().putBoolean(key, value).commit();
	}

}
