package com.caterpillar.demo.factory.abstractFactory.computer.impl;

import com.caterpillar.demo.factory.abstractFactory.computer.IComputer;

/**
 * @author ：caterpillar
 * @description：小米笔记本
 * @date ：Created in 2021/3/8 22:53
 */
public class MiComputer implements IComputer {
    @Override
    public void typewriting() {
        System.out.println("使用小米电脑打字！");
    }

    @Override
    public void watchMovies() {
        System.out.println("使用小米电脑看电影！");
    }

    @Override
    public void listenMusic() {
        System.out.println("使用小米电脑听音乐！");
    }
}
