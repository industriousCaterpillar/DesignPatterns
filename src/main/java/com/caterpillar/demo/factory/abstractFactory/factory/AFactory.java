package com.caterpillar.demo.factory.abstractFactory.factory;

import com.caterpillar.demo.factory.abstractFactory.computer.IComputer;
import com.caterpillar.demo.factory.abstractFactory.computer.impl.MiComputer;
import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;
import com.caterpillar.demo.factory.factoryMethod.phone.impl.MiPhone;

/**
 * @author ：caterpillar
 * @description：A工厂生产小米手机和小米笔记本
 * @date ：Created in 2021/3/8 22:55
 */
public class AFactory extends AbstractFactory {
    @Override
    public IPhone createPhone() {
        System.out.println("---A工厂生产了小米手机---");
        return new MiPhone();
    }

    @Override
    public IComputer createComputer() {
        System.out.println("---A工厂生产了小米笔记本---");
        return new MiComputer();
    }
}
