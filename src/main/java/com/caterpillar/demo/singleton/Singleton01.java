package com.caterpillar.demo.singleton;

/**
 * 单例设计模式：饿汉式
 * @description：单例设计模式：饿汉式
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 20:05
 */
public class Singleton01 {
    // 将自身实例化对象设置为一个属性，并用static final进行修饰
    private static final Singleton01 INSTANCE = new Singleton01();

    // 构造方法私有化
    private Singleton01() {}

    // 静态方法返回该实例
    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
