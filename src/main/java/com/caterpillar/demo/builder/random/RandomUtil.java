package com.caterpillar.demo.builder.random;

/**
 * @author ：caterpillar
 * @description：random类
 * @date ：Created in 2021/3/13 21:31
 */
public class RandomUtil {

    /**
    * 攻击力浮动范围70%~100%
    * @Author: caterpillar
    * @Date: 2021/3/13 21:33
    */
    public static int getAtrrRandom() {
       return  (int)(Math.random() * (31) + 70);
    }

    /**
    * 在当前值的±5上取随机数
    * @Params:
     * @param level: 出入值
    * @return:
    * @Author: caterpillar
    * @Date: 2021/3/20 19:21
    */
    public static int getMonsterLevelRandom(int level) {
        int monsterLeve = getRandom(-5, 5) + level;
        if (monsterLeve <= 0) {
            return 1;
        }
        return  monsterLeve;
    }

    /**
    * 在当前值的±2上取随机数
    * @Params:
     * @param monsterLeve:出入值
    * @return:
    * @Author: caterpillar
    * @Date: 2021/3/20 19:20
    */
    public static int getArmsRandom(int monsterLeve) {
        int armsLevel = getRandom(-2, 2) + monsterLeve;
        if (armsLevel <= 0) {
            return 1;
        }
        return  armsLevel;
    }

    /**
    * 取范围内的随机取数
    * @Params:
     * @param minValue:最小值
     * @param maxValue:最大值
    * @return: 最小值和最大值的区间值
    * @Author: caterpillar
    * @Date: 2021/3/20 19:16
    */
    public static int getRandom(int minValue, int maxValue) {
       return (int)(Math.random() * (maxValue - minValue) + minValue);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(getRandom(-5, 5));
        }
    }
}
