package com.zhu.statics.target;

public class AgencyProxy implements RentHouse {
    // 目标对象
    private RentHouse target;

    public AgencyProxy(RentHouse target){
        this.target = target;
    }

    @Override
    public void toRendHouse() {
        System.out.println("发布租房信息");
        target.toRendHouse();
        System.out.println("准备合同。");
    }
}
