package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        
        System.out.println("Area of Circle is: " + area(radius));
        System.out.println("Circumference of Circle is: " + circumference(radius));
    }
    static double area(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    static double circumference(double radius){
        return 2*Math.PI*radius;
    }
}
