package dsa_bootcamp;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter Time: ");
        double t = sc.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        
        double simpleInterest = (p*r*t)/100;
        
        System.out.println("Your Simple Interest is: " + simpleInterest);
    }
}
