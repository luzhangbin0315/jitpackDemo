package com.ewell.library_two

import android.app.Activity
import android.util.Log
import android.webkit.JavascriptInterface

/**
 *@author: lzb
 *@date: 2020/9/16
 *description:
 */
class WebAppInterface(webListener: WebListener, mActivity: Activity) : Any() {
    private val webListener: WebListener = webListener
    private val mActivity: Activity = mActivity

    @JavascriptInterface
    fun setPower(power: Int) {
        //测试git gaidongyidiandian
        Log.e("WebAppInterface", "设置功率 = $power")
        mActivity.runOnUiThread { webListener.setPower(power) }
    }

    @JavascriptInterface
    fun initRfid() {
        Log.e("WebAppInterface", "初始化Rfid")
        mActivity.runOnUiThread { webListener.initRfid() }
    }

    @JavascriptInterface
    fun startScanRfid() {
        Log.e("WebAppInterface", "开始扫描")
        mActivity.runOnUiThread { webListener.startScanRfid() }
    }

    @JavascriptInterface
    fun startScanCode() {
        Log.e("WebAppInterface", "开始扫描二维码")
        mActivity.runOnUiThread { webListener.startScanCode() }
    }

    @JavascriptInterface
    fun ipConfig() {
        Log.e("WebAppInterface", "网络配置 = " + "网络配置")
        mActivity.runOnUiThread { webListener.ipconfig() }
    }


}