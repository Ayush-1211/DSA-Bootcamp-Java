package com.ayush.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        shapes.area();
        circle.area();
        square.area();
    }
}
