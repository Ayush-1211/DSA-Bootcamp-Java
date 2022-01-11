package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height for triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        double area = 0.5 * base * height;
        
        System.out.println("Area of Tirangle is: " + area);
    }
}
