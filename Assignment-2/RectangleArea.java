package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height and Width for Rectangle: ");
        double height = sc.nextDouble();
        double width = sc.nextDouble();
        
        double area = height * width;
        
        System.out.println("Area of Rectangle is: " + area);
    }
}
