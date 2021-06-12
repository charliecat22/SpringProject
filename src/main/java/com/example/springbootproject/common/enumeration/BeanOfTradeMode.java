package com.example.springbootproject.common.enumeration;

import com.example.springbootproject.common.constant.BeanIdConstant;
import com.example.springbootproject.common.constant.TradeModeConstant;

/**
 * 交易方式对应实例ID枚举
 *
 * @author ZYH
 * @date 2021-06-12 12:37 上午
 **/
public enum BeanOfTradeMode {
    /**
     * 债券买入
     */
    SECURUTY_BUY(TradeModeConstant.SECURITY_BUY, BeanIdConstant.SECURITY_BUY);

    private final String tradeMode;
    private final String beanId;

    BeanOfTradeMode(String tradeMode, String beanId) {
        this.tradeMode = tradeMode;
        this.beanId = beanId;
    }

    public String getTradeMode() {
        return this.tradeMode;
    }

    public String getBeanId() {
        return this.beanId;
    }


}
