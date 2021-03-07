package com.caterpillar.demo.strategy;

/**
 * 测试策略设计模式
 * @description：测试策略设计模式
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 21:25
 */
public class SortStrategyTest {

    /**
     * 随机数最大数量
     */
    private static final int RANDOM_MAX_COUNT = 10000;

    /**
     * 取0~RANDOM_MAX_NUM 之间的数
     */
    private static final int RANDOM_MAX_NUM = 1000000;


    public static void main(String[] args) {
        // 冒泡排序
        Context bubbleContext = new Context(new BubbleSort());
        bubbleContext.sort(genRandomNum());
        // 选择排序
        Context selecionContext = new Context(new SelectionSort());
        selecionContext.sort(genRandomNum());
        // 插入排序
        Context insertionContext = new Context(new InsertionSort());
        insertionContext.sort(genRandomNum());
        // 数组默认排序
        Context arrayContext = new Context(new ArraySort());
        arrayContext.sort(genRandomNum());
    }

    /**
    * 获取随机数
    * @Description: 获取随机数
    * @Author: caterpillar
    * @Date: 2021/2/28 23:16
    */
    private static int[] genRandomNum() {
        int[] data = new int[RANDOM_MAX_COUNT];
        for (int i = 0; i < RANDOM_MAX_COUNT; i++) {
            data[i] = (int)(Math.random() * (RANDOM_MAX_NUM + 1));
//            data[i] = i;
        }
        return data;
    }

}
