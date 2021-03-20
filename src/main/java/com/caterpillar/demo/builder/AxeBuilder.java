package com.caterpillar.demo.builder;

import com.caterpillar.demo.builder.random.RandomUtil;

import java.math.BigDecimal;

/**
 * @author ：caterpillar
 * @description：斧子建造者
 * @date ：Created in 2021/3/17 23:37
 */
public class AxeBuilder extends ArmsBuilder{
    Arms arms = new Arms();

    @Override
    public void buildLevel(int level) {
        arms.setLevel(RandomUtil.getArmsRandom(level));
    }

    @Override
    public void buildSpeeed() {
        arms.setSpeed("斧子攻击速度为:0.7");
    }

    @Override
    public void buildAttack(int level) {
        BigDecimal baseAttack = new BigDecimal(level * RandomUtil.getAtrrRandom());
        BigDecimal maxAttack = baseAttack.multiply(new BigDecimal(1.3));
        BigDecimal minAttack = baseAttack.multiply(new BigDecimal(1.1));
        String attack = "斧子攻击力为:" + minAttack.intValue() + "~" + maxAttack.intValue();
        arms.setAttacK(attack);
    }

    @Override
    public Arms getArms() {
        return arms;
    }
}
