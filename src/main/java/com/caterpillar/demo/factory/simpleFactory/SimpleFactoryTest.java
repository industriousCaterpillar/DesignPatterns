package com.caterpillar.demo.factory.simpleFactory;

import com.caterpillar.demo.factory.simpleFactory.phone.IPhone;

/**
 * @author ：caterpillar
 * @description：简单工厂测试类
 * @date ：Created in 2021/3/7 19:38
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();
        System.out.println("---------小米手机功能如下---------");
        IPhone miPhone = phoneFactory.createPhone(PhoneConstant.MI_PHONE);
        miPhone.call();
        miPhone.sendMessage();
        miPhone.playGame();

        System.out.println("---------oppo手机功能如下---------");
        IPhone oppoPhone = phoneFactory.createPhone(PhoneConstant.OPPO_PHONE);
        oppoPhone.call();
        oppoPhone.sendMessage();
        oppoPhone.playGame();

        System.out.println("---------vivo手机功能如下---------");
        IPhone vivoPhone = phoneFactory.createPhone(PhoneConstant.VIVO_PHONE);
        vivoPhone.call();
        vivoPhone.sendMessage();
        vivoPhone.playGame();
    }
}
