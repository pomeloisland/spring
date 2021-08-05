package com.pomeloisland.demo03;

import com.pomeloisland.dem01.Rent;

//房东
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
