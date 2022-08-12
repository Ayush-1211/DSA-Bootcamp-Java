package com.ayush.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student ayush = new Student(12, 80.97f);
        Student anand = new Student(10, 99.56f);

        if (ayush.compareTo(anand) < 0) {
            System.out.println(ayush.compareTo(anand));
            System.out.println("Anand has more marks");
        }
    }
}
