package com.example.demo.engine.constants;


import java.nio.channels.AcceptPendingException;

public enum WorkOrderProStateEnum {
    CREATE(1, "新建"),
    ACCEPT(2, "接受"),
    SENTOUT(3, "出发"),
    APPLY(4, "申请"),
    ADUIT(5, "审核");
    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private WorkOrderProStateEnum(int index, String name) {

        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
