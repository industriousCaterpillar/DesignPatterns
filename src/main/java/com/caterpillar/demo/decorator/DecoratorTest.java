package com.caterpillar.demo.decorator;

import com.caterpillar.demo.decorator.equip.Arms;
import com.caterpillar.demo.decorator.equip.Clothes;
import com.caterpillar.demo.decorator.equip.ContextEquipe;
import com.caterpillar.demo.decorator.equip.Equip;
import com.caterpillar.demo.decorator.role.Role;
import com.caterpillar.demo.decorator.role.Warrior;

/**
 * @author ：caterpillar
 * @description：测试装饰设计模式
 * @date ：Created in 2021/3/9 22:36
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Role warrior = new Warrior();
        warrior.wearEquip();
    }
}
