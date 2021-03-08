package com.caterpillar.demo.factory.abstractFactory.phone;

/**
 * 手机接口
 */
public interface IPhone {
    /**
     * 打电话
     * @Author: caterpillar
     * @Date: 2021/3/7 19:17
     */
    void call();

    /**
     * 发送短信
     * @Author: caterpillar
     * @Date: 2021/3/7 19:17
     */
    void sendMessage();

    /**
     * 玩游戏
     * @Author: caterpillar
     * @Date: 2021/3/7 19:18
     */
    void playGame();
}
