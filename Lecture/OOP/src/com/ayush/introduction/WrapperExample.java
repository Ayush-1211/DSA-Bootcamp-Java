package com.ayush.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;     // primitive
//        int b = 20;

//        Integer num = 30;   // object

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        final A ayush = new A("Ayush Prajapati");
        ayush.name = "Other name";

        // when a non-primitive is final you cannot reassign it
//        ayush = new A("new object");      // this will not work
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
}
