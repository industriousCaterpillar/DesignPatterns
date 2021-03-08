package com.caterpillar.demo.factory.simpleFactory;

import com.caterpillar.demo.factory.simpleFactory.phone.IPhone;
import com.caterpillar.demo.factory.simpleFactory.phone.impl.MiPhone;
import com.caterpillar.demo.factory.simpleFactory.phone.impl.OppoPhone;
import com.caterpillar.demo.factory.simpleFactory.phone.impl.VivoPhone;

/**
 * @author ：caterpillar
 * @description：手机工厂
 * @date ：Created in 2021/3/7 19:28
 */
public class PhoneFactory {

    /**
    * 手机工厂类
    * @Params:
     * @param phoneType: 手机类型
    * @return:
    * @Author: caterpillar
    * @Date: 2021/3/7 19:37
    */
    public IPhone createPhone(String phoneType) {
        if (phoneType.equals(PhoneConstant.MI_PHONE)) {
            return new MiPhone();
        } else if (phoneType.equals(PhoneConstant.OPPO_PHONE)) {
            return new OppoPhone();
        } else if (phoneType.equals(PhoneConstant.VIVO_PHONE)) {
            return new VivoPhone();
        } else {
            return  null;
        }
    }
}
