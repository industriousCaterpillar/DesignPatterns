package com.caterpillar.demo.factory.abstractFactory.factory;

import com.caterpillar.demo.factory.abstractFactory.computer.IComputer;
import com.caterpillar.demo.factory.abstractFactory.computer.impl.LenovoComputer;
import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;
import com.caterpillar.demo.factory.factoryMethod.phone.impl.VivoPhone;

/**
 * @author ：caterpillar
 * @description：B工厂生产vivo手机和联想电脑
 * @date ：Created in 2021/3/8 22:59
 */
public class BFactory extends AbstractFactory {
    @Override
    public IPhone createPhone() {
        System.out.println("---B工厂生产了vivo手机---");
        return new VivoPhone();
    }

    @Override
    public IComputer createComputer() {
        System.out.println("---B工厂生产了Lenovo电脑---");
        return new LenovoComputer();
    }
}
