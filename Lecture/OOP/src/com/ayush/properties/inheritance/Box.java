package com.ayush.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
//    double weight;

    Box() {         // constructor

//        super();        // object class
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {      // constructor
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {     // constructor
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {      // constructor
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
