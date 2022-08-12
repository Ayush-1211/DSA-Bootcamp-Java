package com.ayush.abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }
    abstract void career();
    abstract void partner();

    static void hello() {
        System.out.println("Hello");
    }

    void normal() {
        System.out.println("This is a normal method");
    }
}
