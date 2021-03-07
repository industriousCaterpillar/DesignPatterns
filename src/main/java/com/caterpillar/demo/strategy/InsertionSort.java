package com.caterpillar.demo.strategy;

import java.util.Arrays;

/**
 * 插入排序
 * @description：插入排序
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 22:24
 */
public class InsertionSort implements IArrayDataSort{
    @Override
    public void intDataSort(int[] intArrayData) {
        System.out.println("插入排序排序前：" + Arrays.toString(intArrayData));
        long start = System.currentTimeMillis();
        for (int i = 0; i < intArrayData.length - 1; i++) {
            int preIndex = i;
            int current = intArrayData[i + 1];
            while (preIndex >= 0 && current < intArrayData[preIndex] ) {
                intArrayData[preIndex + 1] = intArrayData[preIndex];
                preIndex -- ;
            }
            intArrayData[preIndex + 1] = current;
        }
        long end = System.currentTimeMillis();
        System.out.println("插入排序排序后：" + Arrays.toString(intArrayData));
        System.out.println("插入排序耗时：" + (end - start) + "ms");

    }
}
