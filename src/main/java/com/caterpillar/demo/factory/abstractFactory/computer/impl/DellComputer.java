package com.caterpillar.demo.factory.abstractFactory.computer.impl;

import com.caterpillar.demo.factory.abstractFactory.computer.IComputer;

/**
 * @author ：caterpillar
 * @description：戴尔电脑
 * @date ：Created in 2021/3/8 22:50
 */
public class DellComputer implements IComputer {
    @Override
    public void typewriting() {
        System.out.println("使用Dell电脑打字！");
    }

    @Override
    public void watchMovies() {
        System.out.println("使用Dell电脑看电影！");
    }

    @Override
    public void listenMusic() {
        System.out.println("使用Dell电脑听音乐！");
    }
}
