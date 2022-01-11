package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Cone: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the Height of Cone: ");
        double height = sc.nextDouble();
        
        double volume = (Math.PI * radius * radius) * height / 3;
        System.out.println("The volume of the cone is: " + volume);
    }
}
