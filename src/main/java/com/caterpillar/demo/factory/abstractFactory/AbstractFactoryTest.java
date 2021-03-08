package com.caterpillar.demo.factory.abstractFactory;

import com.caterpillar.demo.factory.abstractFactory.computer.IComputer;
import com.caterpillar.demo.factory.abstractFactory.factory.AFactory;
import com.caterpillar.demo.factory.abstractFactory.factory.AbstractFactory;
import com.caterpillar.demo.factory.abstractFactory.factory.BFactory;
import com.caterpillar.demo.factory.abstractFactory.factory.CFactory;
import com.caterpillar.demo.factory.factoryMethod.phone.IPhone;

/**
 * @author ：caterpillar
 * @description：抽象工厂测试类
 * @date ：Created in 2021/3/8 23:01
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("---------A工厂方法如下---------");
        AbstractFactory aFactory = new AFactory();
        IPhone aphone = aFactory.createPhone();
        aphone.call();
        aphone.sendMessage();
        aphone.playGame();
        IComputer aComputer = aFactory.createComputer();
        aComputer.typewriting();
        aComputer.listenMusic();
        aComputer.watchMovies();

        System.out.println("---------B工厂方法如下---------");
        AbstractFactory bFactory = new BFactory();
        IPhone bphone = bFactory.createPhone();
        bphone.call();
        bphone.sendMessage();
        bphone.playGame();
        IComputer bComputer = bFactory.createComputer();
        bComputer.typewriting();
        bComputer.listenMusic();
        bComputer.watchMovies();

        System.out.println("---------C工厂方法如下---------");
        AbstractFactory cFactory = new CFactory();
        IPhone cphone = cFactory.createPhone();
        cphone.call();
        cphone.sendMessage();
        cphone.playGame();
        IComputer cComputer = cFactory.createComputer();
        cComputer.typewriting();
        cComputer.listenMusic();
        cComputer.watchMovies();
    }
}
