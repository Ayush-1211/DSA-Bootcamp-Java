package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of one diagonal of Rhombus: ");
        double d1 = sc.nextDouble();
        System.out.println("Enter the length of the other diagonal of Rhombus: ");
        double d2 = sc.nextDouble();
        
        double area = (d1 * d2) / 2;
        
        System.out.println("Area of Rhombus is: " + area);
    }
}
