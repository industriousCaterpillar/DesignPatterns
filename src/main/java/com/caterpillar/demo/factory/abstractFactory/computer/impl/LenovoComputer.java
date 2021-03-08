package com.caterpillar.demo.factory.abstractFactory.computer.impl;

import com.caterpillar.demo.factory.abstractFactory.computer.IComputer;

/**
 * @author ：caterpillar
 * @description：联想电脑
 * @date ：Created in 2021/3/8 22:52
 */
public class LenovoComputer implements IComputer {
    @Override
    public void typewriting() {
        System.out.println("使用Lenovo电脑打字！");
    }

    @Override
    public void watchMovies() {
        System.out.println("使用Lenovo电脑看电影！");
    }

    @Override
    public void listenMusic() {
        System.out.println("使用Lenovo电脑听音乐！");
    }
}
