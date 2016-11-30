package com.example.administrator.rxjavatest;

import java.util.List;

/**
 * Created by Administrator on 2016/11/21.
 */
public class Student {

    private int id;
    private String name;
    private List<Clazz> clazz;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public List<Clazz> getClazz() {
        return clazz;
    }

    public void setClazz(List<Clazz> clazz) {
        this.clazz = clazz;
    }
}
