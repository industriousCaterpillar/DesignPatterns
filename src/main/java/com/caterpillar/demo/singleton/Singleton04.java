package com.caterpillar.demo.singleton;

/**
 * 单例设计模式：懒汉式二 双重检查模式
 * @author ：caterpillar
 * @description：单例设计模式：懒汉式二 双重检查模式，这种没有问题。
 * @date ：Created in 2021/2/28 20:12
 */
public class Singleton04 {
    // 将自身实例化对象初始化一个属性，并用static修饰
    private static Singleton04 INSTANCE ;
    // 构造函数私有化
    private Singleton04() {};
    // 静态方法返回该实列对象
    public static Singleton04 getInstance() {
        // 第一次检查，判断INSTANCE是否被实例化
        if (INSTANCE == null) {
            synchronized (Singleton04.class) {
                // 这里进行测试，当线程睡眠1ms时，不用双重检查，会实例化不同的对象
                /*try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                // 获取锁，如果对象仍未被实例化，实例化该对象
                if (INSTANCE == null) {
                    INSTANCE = new Singleton04();
                }
            }
        }
        return INSTANCE;
    }
}
