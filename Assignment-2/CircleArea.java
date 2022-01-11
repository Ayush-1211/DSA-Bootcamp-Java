package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Circle Radius: ");
        float r = sc.nextFloat();
        
        System.out.println("Area of Circle is " + (Math.PI * r * r));
    }
}
