package com.ayush.enumExamples;

public class Basic {

    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you can create child enums
        // type is Week


        // this is not public or protected, only private or default
        // because we don't want to create new objects
        // this is not the enum concept why
        // Internally: public static final Week Monday = new Week();
        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hey Hello How are you?");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week);

//        System.out.println(week.ordinal());

        week.hello();
    }
}
