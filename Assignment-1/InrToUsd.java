package dsa_bootcamp;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency in Rupees: ");
        double rup = sc.nextDouble();
        
        double usd = rup * 0.013;
        
        System.out.println(rup + " Rupees to USD is " + usd + "$");
    }
}
