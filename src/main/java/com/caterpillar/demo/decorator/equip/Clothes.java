package com.caterpillar.demo.decorator.equip;

/**
 * @author ：caterpillar
 * @description：衣服
 * @date ：Created in 2021/3/9 23:08
 */
public class Clothes extends DecoratorEquip{

    public Clothes(Equip equip) {
        super(equip);
    }

    public void wearClother() {
        System.out.println("穿上了铠甲...");
    }

    @Override
    public void decoratorEquip() {
        super.decoratorEquip();
        wearClother();
    }
}
