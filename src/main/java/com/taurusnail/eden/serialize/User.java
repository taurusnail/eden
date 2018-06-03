package com.taurusnail.eden.serialize;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 9064149549016301322L;

    private String name; // 姓名
    private int age; // 年龄
    private String city; // 城市
    private String hobby; // 城市

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
