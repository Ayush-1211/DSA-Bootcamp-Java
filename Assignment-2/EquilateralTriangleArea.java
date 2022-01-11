package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the equilateral triangle: ");
        double side = sc.nextDouble();
        
        double area = (Math.sqrt(3)/4)*side*side;
        
        System.out.println("Area of Equilateral Triangle Area: " + area);
    }
    
}
