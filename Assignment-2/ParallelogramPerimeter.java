package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the parallelogram: ");
        double height = sc.nextDouble();
        
        System.out.println("Perimeter of Parallelogram is: " + 2 * (base + height));
    }
}
