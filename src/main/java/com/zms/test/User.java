package com.zms.test;

/**
 * @Description : TODO
 * @author: zeng.maosen
 * @date: 2023/2/10
 * @version: 1.0
 */
public class User {

    String name;
    String id;
    String password;
    Integer age;

    public User(String name, String id, String password, Integer age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
