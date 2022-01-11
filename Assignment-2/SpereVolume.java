package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class SpereVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        double radius = sc.nextDouble();
        System.out.println("The volume of sphere is " + (4 * Math.PI * radius * radius * radius)/3);
    }
}
