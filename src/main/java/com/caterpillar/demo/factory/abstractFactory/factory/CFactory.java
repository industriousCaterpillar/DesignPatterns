package com.caterpillar.demo.factory.abstractFactory.factory;

import com.caterpillar.demo.factory.abstractFactory.computer.IComputer;
import com.caterpillar.demo.factory.abstractFactory.computer.impl.DellComputer;
import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;
import com.caterpillar.demo.factory.factoryMethod.phone.impl.OppoPhone;

/**
 * @author ：caterpillar
 * @description：C工厂生产oppo手机和dell电脑
 * @date ：Created in 2021/3/8 23:00
 */
public class CFactory extends AbstractFactory {
    @Override
    public IPhone createPhone() {
        System.out.println("---C工厂生产了oppo手机---");
        return new OppoPhone();
    }

    @Override
    public IComputer createComputer() {
        System.out.println("---C工厂生产了Dell电脑---");
        return new DellComputer();
    }
}
