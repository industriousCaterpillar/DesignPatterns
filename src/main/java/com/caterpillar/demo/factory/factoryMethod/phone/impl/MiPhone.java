package com.caterpillar.demo.factory.factoryMethod.phone.impl;

import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;

/**
 * @author ：caterpillar
 * @description：小米手机
 * @date ：Created in 2021/3/7 19:23
 */
public class MiPhone implements IPhone {
    @Override
    public void call() {
        System.out.println("使用小米手机呼叫！");
    }

    @Override
    public void sendMessage() {
        System.out.println("使用小米手机发送短信！");
    }

    @Override
    public void playGame() {
        System.out.println("使用小米手机玩游戏！");
    }
}
