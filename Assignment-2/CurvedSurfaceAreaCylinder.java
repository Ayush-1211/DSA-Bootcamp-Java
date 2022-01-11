package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double h= sc.nextDouble();
        double curvedSurfaceArea = 2*Math.PI*r*h;
        System.out.println("Curved Surface Area Of Cylinder is " + curvedSurfaceArea);
    }
}
