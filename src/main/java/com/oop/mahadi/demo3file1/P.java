package com.oop.mahadi.demo3file1;

import java.io.Serializable;

public class P implements Serializable {
    String name;

    public P(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "P{" +
                "name='" + name + '\'' +
                '}';
    }
}
