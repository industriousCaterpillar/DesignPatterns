package com.caterpillar.demo.builder;

import com.caterpillar.demo.builder.random.RandomUtil;

import java.util.Random;

/**
 * @author ：caterpillar
 * @description：建造者模式测试类
 * @date ：Created in 2021/3/17 23:24
 */
public class BuildTest {
    public static final String[] arms = {"axe", "sword", "dagger"};

    public static void main(String[] args) {
        int level = 10;
        for (int i = 0; i < 100; i++) {
            int monsterLevel = RandomUtil.getMonsterLevelRandom(10);
            System.out.println("杀死了" + monsterLevel + "级怪兽，");
            ArmsBuilder armsBuilder = null;
            int nums = new Random().nextInt(3);
            String arm = arms[nums];
            if ("axe".equals(arm)) {
                armsBuilder =  new AxeBuilder();
            } else if ("sword".equals(arm)) {
                armsBuilder = new SwordBuilder();
            } else if ("dagger".equals(arm)) {
                armsBuilder = new DaggerBuilder();
            }
            ArmsDirector armsDirector = new ArmsDirector(armsBuilder);
            Arms arms = armsDirector.ConstructArms(monsterLevel);
            System.out.println(arms);
        }
    }
}
