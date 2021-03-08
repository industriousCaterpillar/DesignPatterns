package com.caterpillar.demo.factory.factoryMethod;

import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;
import com.caterpillar.demo.factory.factoryMethod.phone.impl.MiPhone;
import com.caterpillar.demo.factory.factoryMethod.phoneFactory.IPhoneFactory;
import com.caterpillar.demo.factory.factoryMethod.phoneFactory.impl.MiPhoneFactory;
import com.caterpillar.demo.factory.factoryMethod.phoneFactory.impl.OppoPhoneFactory;
import com.caterpillar.demo.factory.factoryMethod.phoneFactory.impl.VivoPhoneFactory;

/**
 * @author ：caterpillar
 * @description：工厂方法测试类
 * @date ：Created in 2021/3/7 19:57
 */
public class FactoryMethodTest {
    public static void main(String[] args) {

        System.out.println("---------小米手机功能如下---------");
        IPhoneFactory miPhoneFactory = new MiPhoneFactory();
        IPhone miPhone = miPhoneFactory.creaePhone();
        miPhone.call();
        miPhone.sendMessage();
        miPhone.playGame();

        System.out.println("---------oppo手机功能如下---------");
        IPhoneFactory oppoPhoneFactory = new OppoPhoneFactory();
        IPhone oppoPhone = oppoPhoneFactory.creaePhone();
        oppoPhone.call();
        oppoPhone.sendMessage();
        oppoPhone.playGame();

        System.out.println("---------vivo手机功能如下---------");
        IPhoneFactory vivoPhoneFactory = new VivoPhoneFactory();
        IPhone vivoPhone = vivoPhoneFactory.creaePhone();
        vivoPhone.call();
        vivoPhone.sendMessage();
        vivoPhone.playGame();
    }
}
