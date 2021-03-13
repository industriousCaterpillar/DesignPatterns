package com.caterpillar.demo.decorator.role;

import com.caterpillar.demo.decorator.equip.Arms;
import com.caterpillar.demo.decorator.equip.Clothes;
import com.caterpillar.demo.decorator.equip.ContextEquipe;
import com.caterpillar.demo.decorator.equip.Equip;
import com.sun.jdi.event.EventQueue;

/**
 * @author ：caterpillar
 * @description：勇者角色
 * @date ：Created in 2021/3/9 22:42
 */
public class Warrior extends Role {

    @Override
    public void wearEquip() {
        System.out.println("勇者准备穿装备.....");
        Equip equip = new ContextEquipe();
        equip = new Clothes(equip);
        equip = new Arms(equip);
        equip.decoratorEquip();
    }
}
