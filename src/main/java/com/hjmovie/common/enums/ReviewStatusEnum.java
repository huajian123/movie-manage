package com.hjmovie.common.enums;

/**
 * 枚举描述:　审核状态
 *
 * @author fbl
 * @date 2019-11-12 09:01
 */
public enum ReviewStatusEnum {

    /**
     * 待提交
     */
    REVIEW_STATUS_1(1, "待审核"),

    /**
     * 待审核
     */
    REVIEW_STATUS_2(2, "审核不通过"),

    /**
     * 审核不通过
     */
    REVIEW_STATUS_3(3, "审核通过");

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

    ReviewStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
