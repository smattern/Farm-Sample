package com.mattern.domain;

import java.util.ArrayList;

/**
 * @author smattern on 04/10/16.
 */
public class Farm {

    private String name;
    private int capacity;
    private ArrayList<Chick> farm;

    public Farm(){
        farm = new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Chick> getFarm() {
        return farm;
    }

    public void setFarm(ArrayList<Chick> farm) {
        this.farm = farm;
    }
}
