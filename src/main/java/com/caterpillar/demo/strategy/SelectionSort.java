package com.caterpillar.demo.strategy;

import java.util.Arrays;

/**
 * 选择排序
 * @description：选择排序
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 22:16
 */
public class SelectionSort implements IArrayDataSort{
    @Override
    public void intDataSort(int[] intArrayData) {
        System.out.println("选择排序排序前：" + Arrays.toString(intArrayData));
        long start = System.currentTimeMillis();
        for (int i = 0; i < intArrayData.length; i++) {
            int index = i;
            for (int j = i; j < intArrayData.length; j++) {
                if (intArrayData[j] < intArrayData [index]) {
                    index = j;
                }
            }
            int temp = intArrayData[i];
            intArrayData[i] = intArrayData[index];
            intArrayData[index] = temp;
        }
        long end = System.currentTimeMillis();
        System.out.println("选择排序排序后：" + Arrays.toString(intArrayData));
        System.out.println("选择排序耗时：" + (end - start) + "ms");

    }
}
