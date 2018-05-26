package com.test.hudezhi.myapplication.utils;

import android.view.View;
import android.widget.PopupWindow;

/**
 * created by hudezhi on 2018/5/26
 */

public class CalculatorManager {

    private static CalculatorManager mInstance;

    private OnCalculatorClickListener mListener;

    private PopupWindow mPopupWindow;

    private View mPopView;

    private CalculatorManager() {

    }

    /**
     * 计算器监听器
     */
    public interface OnCalculatorClickListener {
        public void onCalculatorClick(View child, int childId);
    }

    /**
     * 设置计算器监听器
     */
    public void setOnCalculatorClickListener(OnCalculatorClickListener listener) {
        this.mListener = listener;
    }


    public static CalculatorManager getInstance() {
        if (mInstance == null) {
            mInstance = new CalculatorManager();
        }
        return mInstance;
    }

    /**
     * 显示计算器
     */
    public void showCalculator() {

    }

    /**
     * 隐藏计算器
     */
    public void dismissCalculator() {

    }

    /**
     * 回收计算器
     */
    public void destroyDismiss() {

    }

}
