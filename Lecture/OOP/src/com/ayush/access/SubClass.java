package com.ayush.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(12, "Ayush Prajapati");
        int n = obj.num2;
        System.out.println(n);

        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Object);
    }
}
