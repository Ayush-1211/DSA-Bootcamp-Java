package com.ayush.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] roll = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        Student[] students = new Student[5];

        // just declaring
//        Student ayush;
//        ayush = new Student();

        Student ayush = new Student();
//        ayush.roll = 12;
//        ayush.name = "Ayush Prajapati";
//        ayush.marks = 95.6f;

//        ayush.greeting();
//        ayush.changeName("Ayush");

        System.out.println(ayush.roll);
        System.out.println(ayush.name);
        System.out.println(ayush.marks);

        System.out.println("-----------------------------------------------");

        Student anand = new Student(13, "Anand Suthar", 89.6f);

        System.out.println(anand.roll);
        System.out.println(anand.name);
        System.out.println(anand.marks);

        System.out.println("-----------------------------------------------");

        Student random = new Student(ayush);
        System.out.println(random.name);

        System.out.println("-----------------------------------------------");

        Student random2 = new Student();
        System.out.println(random2.name);

        System.out.println("-----------------------------------------------");

        Student one = new Student();
        Student two = one;

        one.name = "Something Something";
        System.out.println(two.name);
    }

    // create a class
    static class Student {
        int roll;
        String name;
        float marks;

        // we need a way to add the values of the above properties object by object
        // we need one word to access every object

        void greeting() {
            System.out.println("Hello, my name is " + this.name);
        }

        void changeName(String newName){
            this.name = newName;
        }

        Student(Student other) {     // constructor
            this.roll = 12;
            this.name = "Ayush Prajapati";
            this.marks = 95.6f;
        }

        // Student ayush = new Student(12, "Ayush Prajapati", 90);
        // here "this" will be replaced with "ayush"
        Student(int rno, String name, float marks) {
            this.roll = rno;
            this.name = name;
            this.marks = marks;
        }

        Student () {
            // this is how you call a constructor from another constructor
            // internally: new Student(13, "Default Person", 100.0f)
            this (13, "Default Person", 100.0f);
        }
    }

}
