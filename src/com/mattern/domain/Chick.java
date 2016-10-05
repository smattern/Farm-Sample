package com.mattern.domain;

import com.mattern.enumaration.ChickType;

/**
 * @author smattern on 04/10/16.
 */
public class Chick {

    private int age;

    private String name;

    private ChickType chickType;

    public Chick(){

    }

    public Chick(int age, String name, ChickType chickType) {
        this.age = age;
        this.name = name;
        this.chickType = chickType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChickType getChickType() {
        return chickType;
    }

    public void setChickType(ChickType chickType) {
        this.chickType = chickType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
