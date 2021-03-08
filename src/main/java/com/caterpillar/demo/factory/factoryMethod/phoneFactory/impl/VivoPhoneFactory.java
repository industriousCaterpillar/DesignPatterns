package com.caterpillar.demo.factory.factoryMethod.phoneFactory.impl;

import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;
import com.caterpillar.demo.factory.factoryMethod.phone.impl.VivoPhone;
import com.caterpillar.demo.factory.factoryMethod.phoneFactory.IPhoneFactory;

/**
 * @author ：caterpillar
 * @description：vivo手机工厂类
 * @date ：Created in 2021/3/7 20:14
 */
public class VivoPhoneFactory implements IPhoneFactory {
    @Override
    public IPhone creaePhone() {
        return new VivoPhone();
    }
}
