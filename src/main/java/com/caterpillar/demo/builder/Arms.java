package com.caterpillar.demo.builder;

/**
 * @author ：caterpillar
 * @description：武器
 * @date ：Created in 2021/3/17 23:25
 */
public class Arms {
    private Integer level;// 等级
    private String attacK;// 攻击力
    private String speed;// 攻击速度

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAttacK() {
        return attacK;
    }

    public void setAttacK(String attacK) {
        this.attacK = attacK;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "掉落武器等级为：" + level +
                "," + attacK + "," + speed ;
    }
}
