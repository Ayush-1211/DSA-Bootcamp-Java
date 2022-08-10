package com.ayush.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box(4);
        Box box3 = new Box(4.9, 7.8, 9.9);
        Box box4 = new Box(box3);

        System.out.println(box.l + " " + box.w + " " + box.h);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);
        System.out.println(box4.l + " " + box4.w + " " + box4.h);

        System.out.println("--------------------------------");

        BoxWeight box5 = new BoxWeight();
        BoxWeight box6 = new BoxWeight(4.9, 7.8, 9.9, 5.5);

        System.out.println(box5.l + " " + box5.w + " " + box5.weight);
        System.out.println(box6.l + " " + box6.w + " " + box6.h + " " + box6.weight);

        System.out.println("--------------------------------");

        BoxPrice box7 = new BoxPrice(5, 8, 200);


    }
}
