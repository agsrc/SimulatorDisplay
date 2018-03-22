package com;

public class Register {

    String value;
    int size;

    public Register(String value, int size) {
        this.value = value;
        this.size = size;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
