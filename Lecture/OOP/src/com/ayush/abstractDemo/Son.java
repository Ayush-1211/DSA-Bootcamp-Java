package com.ayush.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(22);
        //this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Deepika");
    }

    @Override
    void normal() {
        System.out.println("This is a normal method");
    }
}
