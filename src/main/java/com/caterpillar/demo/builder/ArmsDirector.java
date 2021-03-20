package com.caterpillar.demo.builder;

import com.caterpillar.demo.buildE.ArmsBuild;

/**
 * @author ：caterpillar
 * @description：武器指挥者类
 * @date ：Created in 2021/3/18 0:22
 */
public class ArmsDirector {
    ArmsBuilder armsBuilder = null;

    public ArmsDirector(ArmsBuilder armsBuilder) {
        this.armsBuilder = armsBuilder;
    }

    public void setArmsBuilder(ArmsBuilder armsBuilder) {
        this.armsBuilder = armsBuilder;
    }

    public Arms ConstructArms(int level) {
        armsBuilder.buildLevel(level);
        armsBuilder.buildSpeeed();
        armsBuilder.buildAttack(level);
        return armsBuilder.getArms();
    }
}
