package com.ayush.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(28);
        //this.age = age;
    }
    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Iron man");
    }
}
