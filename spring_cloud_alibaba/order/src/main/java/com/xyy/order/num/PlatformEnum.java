package com.xyy.order.num;

import cn.hutool.core.util.StrUtil;

/**
 * @author: zyf
 * @create: 2022-01-05 16:52
 **/
public enum PlatformEnum {
    /**
     * 漏洞协同管控平台
     */
    ASSIST_PLATFORM(1,"漏洞协同管控平台"),

    /**
     * 安全众测平台
     */
    ALL_TEST_PLATFORM(2,"安全众测平台"),

    /**
     *
     * 漏洞情报平台
     */
    INTELLIGENCE_PLATFORM(3,"漏洞情报平台");


    private Integer code;

    private String msg;


    PlatformEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsg(Integer code) {
        if (code == null) {
            return null;
        }
        for (PlatformEnum statusEnum : values()) {
            if (statusEnum.getCode().compareTo(code) == 0) {
                return statusEnum.getMsg();
            }
        }
        return null;
    }

    public static Integer getCode(String msg) {
        if (StrUtil.isBlank(msg)) {
            return null;
        }
        for (PlatformEnum statusEnum : values()) {
            if (statusEnum.getMsg().equals(msg)) {
                return statusEnum.getCode();
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
