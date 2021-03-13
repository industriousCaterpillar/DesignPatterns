package com.caterpillar.demo.decorator.equip;

/**
 * @author ：caterpillar
 * @description：抽象装备
 * @date ：Created in 2021/3/9 22:57
 */
abstract class DecoratorEquip extends Equip{

    private Equip equip;

    public DecoratorEquip(Equip equip) {
        this.equip = equip;
    }
    @Override
    public void decoratorEquip() {
        this.equip.decoratorEquip();
    }
}
