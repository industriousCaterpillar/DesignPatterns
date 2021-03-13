package com.caterpillar.demo.decorator.equip;

/**
 * @author ：caterpillar
 * @description：实际穿装备
 * @date ：Created in 2021/3/10 22:32
 */
public class ContextEquipe extends Equip{

    @Override
    public void decoratorEquip() {
        System.out.println("开始穿装备...");
    }
}
