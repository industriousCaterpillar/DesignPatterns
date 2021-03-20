package com.caterpillar.demo.prototype;

import com.caterpillar.demo.prototype.model.Address;
import com.caterpillar.demo.prototype.model.Student;

/**
 * 原型设计模式，实现Cloneable或Serializable接口
 * 优点：1、当创建新的对象实例较为复杂时，使用原型模式可以简化对象的创建过程，通过复制一个已有实例可以提高新实例的创建效率。
 *      2、动态获得对象运行时的状态
 * 缺点：需要为每个类配置一个克隆方法
 * @author ：caterpillar
 * @description：原型设计模式测试
 * @date ：Created in 2021/3/20 23:23
 */
public class PrototypeTest {
    public static void main(String[] args) throws Exception {
        Address address = new Address("北京", "朝阳");
        Address address1 = (Address) address.clone();
        System.out.println("地址克隆前：" + address);
        System.out.println("地址克隆后：" + address1);

        System.out.println("-----------------分割线-----------------");
        System.out.println("浅拷贝");
        Student student = new Student("小明", 18, address);
        Student student2 = (Student) student.clone();
        System.out.println("学生克隆前：" + student);
        System.out.println("学生克隆后：" + student2);
        System.out.println("克隆前后，Address的hashCode值相同，指向同一地址");

        System.out.println("-----------------分割线-----------------");
        System.out.println("深拷贝，Cloneable拷贝");
        Student student3 = (Student) student.deepClone();
        System.out.println("学生克隆前：" + student);
        System.out.println("学生克隆后：" + student3);

        System.out.println("-----------------分割线-----------------");
        System.out.println("深拷贝，序列化拷贝");
        Student student4 = (Student) student.ioClone();
        System.out.println("学生克隆前：" + student);
        System.out.println("学生克隆后：" + student4);

    }
}
