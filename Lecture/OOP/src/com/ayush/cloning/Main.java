package com.ayush.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ayush = new Human(22, "Ayush Prajapati");
//        Human twin = new Human(ayush);

        Human twin = (Human) ayush.clone();
        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(ayush.arr));
    }
}
