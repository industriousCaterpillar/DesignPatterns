package com.caterpillar.demo.singleton;

/**
 * 测试单例设计模式
 * @description：测试单例
 * @author ：caterpillar
 * @date ：Created in 2021/2/28 20:48
 */
public class SingletonTest {

    public static void main(String[] args) {
        // 测试Singelton01，饿汉式
        // singletonTest01();
        // 测试Singelton02
        // singletonTest02();
        // 测试Singelton03
        // singletonTest03();
        // 测试Singelton04
        // singletonTest04();
    }

    /**
    * 测试Singelton02
    * @Description: 测试Singelton04
    * @Author: caterpillar
    * @Date: 2021/2/28 21:21
    */
    private static void singletonTest04() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton04.getInstance().hashCode());
            }).start();
        }
    }

    /**
    * 测试Singelton03
    * @Description: 测试Singelton03
    * @Author: caterpillar
    * @Date: 2021/2/28 21:20
    */
    private static void singletonTest03() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }

    /**
    * 测试Singelton02
    * @Description: 测试Singelton02
    * @Author: caterpillar
    * @Date: 2021/2/28 21:20
    */
    private static void singletonTest02() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton02.getInstance().hashCode());
            }).start();
        }
    }

    /** 
    * 测试Singelton01
    * @Description: 测试Singelton01
    * @Author: caterpillar
    * @Date: 2021/2/28 20:57
    */
    private static void singletonTest01() {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println("s1和s2是否相同：" + (s1 == s2));
    }
}
