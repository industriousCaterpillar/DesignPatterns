package com.caterpillar.demo.factory.factoryMethod.phoneFactory.impl;

import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;
import com.caterpillar.demo.factory.factoryMethod.phone.impl.OppoPhone;
import com.caterpillar.demo.factory.factoryMethod.phoneFactory.IPhoneFactory;

/**
 * @author ：caterpillar
 * @description：oppo手机工厂类
 * @date ：Created in 2021/3/7 20:13
 */
public class OppoPhoneFactory implements IPhoneFactory {
    @Override
    public IPhone creaePhone() {
        return new OppoPhone();
    }
}
