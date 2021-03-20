package com.caterpillar.demo.builder;

/**
 * @author ：caterpillar
 * @description：抽象的建造者
 * @date ：Created in 2021/3/17 23:28
 */
public abstract class ArmsBuilder {

    public abstract void buildLevel(int level);

    public abstract void buildSpeeed();

    public abstract void buildAttack(int level);

    public abstract Arms getArms();
}
