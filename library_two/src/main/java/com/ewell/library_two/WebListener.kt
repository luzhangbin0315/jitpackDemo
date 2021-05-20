package com.ewell.library_two;

/**
 *@author: lzb
 *@date: 2020/8/6
 *description: 交互回调
 */
interface WebListener {

    /**
     * 初始化Rfid
     */
    fun initRfid()

    /**
     * 扫Rfid码
     */
    fun startScanRfid()

    /**
     * 设置功率
     */
    fun setPower(power: Int)

    /**
     * js登录成功回调
     */
    fun loginResponse(userId: String)

    /**
     * js退出登录成功回调
     */
    fun loginOutResponse()

    /**
     * 网络配置
     */
    fun ipconfig()
    /**
     * 扫二维码
     */
    fun startScanCode()


}