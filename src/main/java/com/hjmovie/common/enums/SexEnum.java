package com.hjmovie.common.enums;


/**
 * 枚举功能描述:　性别枚举（getCode、getMsg方法必须有，枚举的属性字段必须是私有且不可变）
 *
 * @author Eternal
 * @date 2018/11/8 15:09
 */

public enum SexEnum {
    /**
     * Sex-男
     */
    SEX_MAN(1, "男"),

    /**
     * Sex-女
     */
    SEX_WOMEN(2, "女");

    private final Integer code;

    private final String msg;

    /**
     * 没有Setter 方法
     */
    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    SexEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
