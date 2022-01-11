package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the height of Rectangle: ");
        double height = sc.nextDouble();
        
        System.out.println("Perimeter of Rectangle is: " + 2*(length+height));
    }
}
