package com.chengzhi.entity;

/**
 * Created by xebest on 2017/12/6.
 */
public enum  TestEnum {
    YES(1,"成功"), NO(2,"失败");

    private int flag;
    private String value;

    TestEnum(int flag, String value) {
        this.flag = flag;
        this.value = value;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
