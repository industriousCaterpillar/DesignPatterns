package com.caterpillar.demo.prototype.model;

import java.io.Serializable;

/**
 * @author ：caterpillar
 * @description：地址, 实现Cloneable接口
 * @date ：Created in 2021/3/20 23:28
 */
public class Address implements Cloneable {
    private String city;// 城市
    private String dstrict;// 区

    public Address(String city, String dstrict) {
        this.city = city;
        this.dstrict = dstrict;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDstrict() {
        return dstrict;
    }

    public void setDstrict(String dstrict) {
        this.dstrict = dstrict;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", dstrict='" + dstrict + '\'' +
                "},Address的hashCode = " +  this.hashCode();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
