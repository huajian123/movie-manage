package com.hjmovie.common.enums;

/**
 * 枚举功能描述:　通知公告类型枚举
 *
 * @author fbl
 * @date 2019/10/11 15:09
 */
public enum NoticeTypeEnum {
    /**
     * 公告
     */
    NOTICE_TYPE_1(1, "公告"),

    /**
     * 行业动态发布
     */
    NOTICE_TYPE_2(2, "行业动态发布"),

    /**
     * 文件通知
     */
    NOTICE_TYPE_3(3, "文件通知"),

    /**
     * 园区介绍
     */
    NOTICE_TYPE_4(4, "园区介绍");

    private Integer code;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    NoticeTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
