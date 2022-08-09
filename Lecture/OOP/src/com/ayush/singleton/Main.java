package com.ayush.singleton;

public class Main {
    public static void main(String[] args) {

        // all 3 ref variables are pointing to just on object
        SingletonClass obj = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();

        SingletonClass obj3 = SingletonClass.getInstance();

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
