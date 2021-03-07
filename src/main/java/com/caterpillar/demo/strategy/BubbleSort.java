package com.caterpillar.demo.strategy;

import java.util.Arrays;

/**
 * 冒泡排序
 * @description：冒泡排序
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 21:30
 */
public class BubbleSort implements IArrayDataSort{
    @Override
    public void intDataSort(int[] intArrayData) {
        System.out.println("冒泡排序排序前：" + Arrays.toString(intArrayData));
        long start = System.currentTimeMillis();
        for (int i = 0; i < intArrayData.length - 1; i++) {
            for (int j = 0; j < intArrayData.length - 1 - i; j++) {
                if (intArrayData[j] > intArrayData[j + 1]) {
                    int temp = intArrayData[j];
                    intArrayData[j] = intArrayData[j + 1];
                    intArrayData[j + 1] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序排序后：" + Arrays.toString(intArrayData));
        System.out.println("冒泡排序耗时：" + (end - start) + "ms");
    }
}
