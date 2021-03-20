package com.caterpillar.demo.builder;

import com.caterpillar.demo.builder.random.RandomUtil;

import java.math.BigDecimal;

/**
 * @author ：caterpillar
 * @description：剑构造类
 * @date ：Created in 2021/3/18 0:17
 */
public class SwordBuilder extends ArmsBuilder{
    Arms arms = new Arms();

    @Override
    public void buildLevel(int level) {
        arms.setLevel(RandomUtil.getArmsRandom(level));
    }

    @Override
    public void buildSpeeed() {
        arms.setSpeed("剑攻击速度为:1.1");
    }

    @Override
    public void buildAttack(int level) {
        BigDecimal baseAttack = new BigDecimal(level * RandomUtil.getAtrrRandom());
        BigDecimal maxAttack = baseAttack.multiply(new BigDecimal(1.1));
        BigDecimal minAttack = baseAttack.multiply(new BigDecimal(0.9));
        String attack = "剑攻击力为:" + minAttack.intValue() + "~" + maxAttack.intValue();
        arms.setAttacK(attack);
    }

    @Override
    public Arms getArms() {
        return arms;
    }
}
