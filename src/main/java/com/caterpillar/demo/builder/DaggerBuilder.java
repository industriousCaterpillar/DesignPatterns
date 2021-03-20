package com.caterpillar.demo.builder;

import com.caterpillar.demo.builder.random.RandomUtil;

import java.math.BigDecimal;

/**
 * @author ：caterpillar
 * @description：匕首构造类
 * @date ：Created in 2021/3/18 0:17
 */
public class DaggerBuilder extends ArmsBuilder{
    Arms arms = new Arms();

    @Override
    public void buildLevel(int level) {
        arms.setLevel(RandomUtil.getArmsRandom(level));
    }

    @Override
    public void buildSpeeed() {
        arms.setSpeed("匕首攻击速度为:1.3");
    }

    @Override
    public void buildAttack(int level) {
        BigDecimal baseAttack = new BigDecimal(level * RandomUtil.getAtrrRandom());
        BigDecimal maxAttack = baseAttack.multiply(new BigDecimal(0.9));
        BigDecimal minAttack = baseAttack.multiply(new BigDecimal(0.7));
        String attack = "匕首攻击力为:" + minAttack.intValue() + "~" + maxAttack.intValue();
        arms.setAttacK(attack);
    }

    @Override
    public Arms getArms() {
        return arms;
    }
}
