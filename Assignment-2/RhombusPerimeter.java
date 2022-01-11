package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class RhombusPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Rhombus: ");
        double side = sc.nextDouble();
        
        System.out.println("Perimeter of Rhombus is: " + (4 * side));
    }
}
