package com.test.hudezhi.myapplication.db;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * created by hudezhi on 2018/5/26
 */

public class ShareHelper {

    private static final String SHARE_NAME = "";
    private static final String IS_LOGIN = "IsLogin";
    private Context mContext;
    private SharedPreferences mSP;

    public ShareHelper(Context context) {
        mSP = context.getSharedPreferences(SHARE_NAME, Context.MODE_PRIVATE);
        this.mContext = context;
    }

    public boolean isLogin() {
        return mSP.getBoolean(IS_LOGIN, false);
    }

    /**
     * 同步提交登录结果
     *
     * @param isLogin
     * @return
     */
    public boolean setLogin(boolean isLogin) {
        SharedPreferences.Editor editor = mSP.edit();
        editor.putBoolean(IS_LOGIN, isLogin);
        return editor.commit();  //同步
    }

    /**
     * 异步提交登录结果
     *
     * @param isLogin
     */
    public void setAsyncLogin(boolean isLogin) {
        SharedPreferences.Editor editor = mSP.edit();
        editor.putBoolean(IS_LOGIN, isLogin);
        editor.apply();
    }

    /**
     * 清楚登录痕迹
     *
     * @return
     */
    public boolean clearLogin() {
        SharedPreferences.Editor editor = mSP.edit();
        editor.putBoolean(IS_LOGIN, false);
        return editor.commit();
    }
}
