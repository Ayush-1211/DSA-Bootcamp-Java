package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = sc.nextDouble();
        
        System.out.println("The Perimeter of circle is: " + (2 * Math.PI * radius));
    }
}
