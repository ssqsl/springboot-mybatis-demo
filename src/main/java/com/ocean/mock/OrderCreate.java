package com.ocean.mock;

import javax.annotation.Resource;

public class OrderCreate {

    @Resource
    private OrderHelper orderHelper;

    public void create() {
        System.out.println(getAmt());
        System.out.println(orderHelper.resolve());
    }

    public int getAmt() {
        return 10;
    }
}
