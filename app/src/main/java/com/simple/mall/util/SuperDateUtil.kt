package com.simple.mall.util

import java.util.Calendar

/**
 * @author jiangshiyu
 * @date 2024/6/11
 * 日期工具
 */
object SuperDateUtil {

    /**
     * 当前年
     */
    fun currentYear(): Int {
        return Calendar.getInstance().get(Calendar.YEAR)
    }
}