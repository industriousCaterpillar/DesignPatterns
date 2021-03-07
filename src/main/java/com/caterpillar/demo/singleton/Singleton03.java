package com.caterpillar.demo.singleton;

/**
 * 单例设计模式：懒汉式二 方法加锁
 * @author ：caterpillar
 * @description：单例设计模式：懒汉式二 方法加锁效率会低。
 * @date ：Created in 2021/2/28 20:12
 */
public class Singleton03 {
    // 将自身实例化对象初始化一个属性，并用static修饰
    private static Singleton03 INSTANCE;

    // 构造函数私有化
    private Singleton03() {}

    // 方法加锁，静态方法返回该实列对象
    public static synchronized Singleton03 getInstance() {
        if (INSTANCE == null) {
            // 这里进行测试，当线程睡眠1ms时，实例化对象相同
           /* try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }
}
