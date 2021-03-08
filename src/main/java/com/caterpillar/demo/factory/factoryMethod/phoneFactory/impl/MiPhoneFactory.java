package com.caterpillar.demo.factory.factoryMethod.phoneFactory.impl;

import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;
import com.caterpillar.demo.factory.factoryMethod.phone.impl.MiPhone;
import com.caterpillar.demo.factory.factoryMethod.phoneFactory.IPhoneFactory;

/**
 * @author ：caterpillar
 * @description：小米手机工厂类
 * @date ：Created in 2021/3/7 20:11
 */
public class MiPhoneFactory implements IPhoneFactory {
    @Override
    public IPhone creaePhone() {
        return new MiPhone();
    }
}
