package com.ayush.access;

public class A {
    private int num;    // we can access this variable only in this file
    protected int num2 = 2;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
