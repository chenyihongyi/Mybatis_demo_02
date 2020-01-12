package com.springboot_mybatis.mybatis_demo_02.entity;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/1/12 16:56
 */
public class User {

    private int id;
    private String name;
    private int age;
    private String description;
    private float height;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", description='" + description + '\'' + ", height=" + height + '}';
    }
}
