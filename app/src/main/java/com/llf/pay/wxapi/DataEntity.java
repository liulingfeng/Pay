package com.llf.pay.wxapi;

/**
 * Created by llf on 2016/6/24.
 */
public class DataEntity {
    public String partnerId;//商户号
    public String prepayid;//支付交易会话ID，预支付Id
    public String noncestr;//随机字符串，不长于32位
    public String timestamp;//时间戳
    public String sign;//签名
}
