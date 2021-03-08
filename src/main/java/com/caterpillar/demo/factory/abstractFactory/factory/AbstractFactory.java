package com.caterpillar.demo.factory.abstractFactory.factory;

import com.caterpillar.demo.factory.abstractFactory.computer.IComputer;
import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;

/**
 * @author ：caterpillar
 * @description：抽象工厂
 * @date ：Created in 2021/3/8 22:37
 */
public abstract class  AbstractFactory {

    /**
    * 手机抽象方法
    * @Author: caterpillar
    * @Date: 2021/3/8 22:56
    */
    public abstract IPhone createPhone();

    /**
    * 电脑抽象方法
    * @Author: caterpillar
    * @Date: 2021/3/8 22:56
    */
    public abstract IComputer createComputer();
}
