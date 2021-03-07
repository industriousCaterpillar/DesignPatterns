package com.caterpillar.demo.strategy;

/**
 * 算法环境类
 * @description：算法环境类
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 21:58
 */
public class Context {
    IArrayDataSort iArrayDataSort;

    public Context(IArrayDataSort iArrayDataSort) {
        this.iArrayDataSort = iArrayDataSort;
    }

    public void sort(int[] intArrayData) {
        iArrayDataSort.intDataSort(intArrayData);
    }

}
