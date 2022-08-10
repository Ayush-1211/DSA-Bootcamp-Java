package com.ayush.properties.inheritance;

public class BoxWeight extends Box{         // "Box" class inherited
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight) {
        // used to initialize values present in parent class
        super(l, h, w);     // call the parent class constructor
        this.weight = weight;

//        System.out.println(this.weight);    // this will call from "BoxWeight"
//        System.out.println(super.weight);   // this will call from "Box"
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
