package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class CurvedSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the cube");
         double side = sc.nextDouble();
         double curvedSurfaceArea = 6*side*side;
         System.out.println("The total surface area of the cube is " + curvedSurfaceArea);
    }
}
