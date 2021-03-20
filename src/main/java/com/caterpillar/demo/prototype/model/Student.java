package com.caterpillar.demo.prototype.model;

import java.io.*;

/**
 * @author ：caterpillar
 * @description：学生类,实现Cloneable和Serializable接口
 * @date ：Created in 2021/3/20 23:27
 */
public class Student implements Cloneable, Serializable {
    private String name; // 姓名
    private int age;// 年龄
    private Address address;// 地址

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                "},Student的hashCode = " + this.hashCode();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
    * 利用Cloneable 进行深拷贝
    * @Author: caterpillar
    * @Date: 2021/3/20 23:42
    */
    public Object deepClone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.address = (Address) this.address.clone();
        return student;
    }

    /**
    * 利用Serializable进行深拷贝
    * @Author: caterpillar
    * @Date: 2021/3/20 23:43
    */
    public Object ioClone() {
        Object obj = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ByteArrayInputStream bis = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);// 当前对象以对象流的方式输出

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            obj = ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return obj;
        }
    }
}

