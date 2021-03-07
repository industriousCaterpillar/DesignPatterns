package com.caterpillar.demo.singleton;

/**
 * 单例设计模式：懒汉式一
 * @description：单例设计模式：懒汉式一，此方法在多线程会有问题
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 20:05
 */
public class Singleton02 {
    // 将自身实例化对象默认设置一个属性，并用static修饰
    private static Singleton02 INSTANCE;

    // 构造方法私有化
    private Singleton02() {}

    // 静态方法返回该实例
    public static Singleton02 getInstance() {
        if (INSTANCE == null) {
            // 这里进行测试，当线程睡眠1ms时，此处会实例化不同的对象
           /* try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }
}
