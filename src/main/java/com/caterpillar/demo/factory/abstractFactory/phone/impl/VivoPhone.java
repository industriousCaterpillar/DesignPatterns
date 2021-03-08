package com.caterpillar.demo.factory.abstractFactory.phone.impl;

import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;

/**
 * @author ：caterpillar
 * @description：vivo手机
 * @date ：Created in 2021/3/7 19:22
 */
public class VivoPhone implements IPhone {
    @Override
    public void call() {
        System.out.println("使用vivo手机呼叫！");
    }

    @Override
    public void sendMessage() {
        System.out.println("使用vivo手机发送短信！");
    }

    @Override
    public void playGame() {
        System.out.println("使用vivo手机玩游戏！");
    }
}
