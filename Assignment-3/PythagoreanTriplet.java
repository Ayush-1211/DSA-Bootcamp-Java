package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("Enter the third number :");
        int c = sc.nextInt();
        if(tripletOrNot(a, b, c)){
            System.out.println("These numbers are pythagorean triplet!");
        }
        else{
            System.out.println("These numbers are not a pythagorean triplet!");
        }
    }
    static boolean tripletOrNot(int a, int b, int c) {
        if (a < b && b < c) {
            if (a * a + b * b == c * c) {
                return true;
            }
        }
        return false;
    }       
}
