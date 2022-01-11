package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class EquilateralTrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a side of equilateral triangle: ");
        double side = sc.nextDouble();
        
        System.out.println("The perimeter of the equilateral triangle is " + (3 * side));
    }
}
