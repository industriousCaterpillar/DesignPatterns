package com.caterpillar.demo.decorator.equip;

/**
 * @author ：caterpillar
 * @description：武器
 * @date ：Created in 2021/3/9 23:04
 */
public class Arms extends DecoratorEquip{
    // 构造函数
    public Arms(Equip equip) {
        super(equip);
    }

    private void wearArms() {
        System.out.println("拿起了武器...");
    }

    @Override
    public void decoratorEquip() {
        super.decoratorEquip();
        this.wearArms();
    }
}
