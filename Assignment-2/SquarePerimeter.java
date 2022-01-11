package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the side of Square: ");
        double side = sc.nextDouble();
        
        System.out.println("Perimeter of Square is: " + (4 * side));
    }
}
