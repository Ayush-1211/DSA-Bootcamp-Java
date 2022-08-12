package com.ayush.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.brake();
//        car.acc();
//        car.start();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
