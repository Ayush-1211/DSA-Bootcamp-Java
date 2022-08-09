package com.ayush.staticExample;

public class Main {
    public static void main(String[] args) {
        Human ayush = new Human(22, "Ayush Prajapati", 50000, false);
        Human anand = new Human(34, "Anand", 70000, true);

        System.out.println(ayush.name);
        System.out.println(anand.salary);

        System.out.println("------------------------------");

//        System.out.println(ayush.population);
//        System.out.println(anand.population);

        System.out.println(Human.population);
    }

    // static is not dependent on any object
    static void fun(){
        //greeting();   // we cannot use this because it requires an instance
                        // but the function we are using it in does not depend on instances

        // we cannot access non-static stuff without referencing their instances in a static context

        // so here we can referencing it
        Main obj = new Main();
        obj.greeting();
    }

    // something which is not static, belongs to an object
    void greeting(){
        System.out.println("Hello World");
        //fun();      // we can use "static" function in "non-static" function
    }
}
