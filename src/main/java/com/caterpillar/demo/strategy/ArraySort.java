package com.caterpillar.demo.strategy;

import java.util.Arrays;

/**
 * 数组默认排序
 * @description：数组默认排序
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 22:52
 */
public class ArraySort implements IArrayDataSort{
    @Override
    public void intDataSort(int[] intArrayData) {
        System.out.println("数组默认排序排序前：" + Arrays.toString(intArrayData));
        long start = System.currentTimeMillis();
        Arrays.sort(intArrayData);
        long end = System.currentTimeMillis();
        System.out.println("数组默认排序排序后：" + Arrays.toString(intArrayData));
        System.out.println("数组默认排序耗时：" + (end - start) + "ms");
    }
}
