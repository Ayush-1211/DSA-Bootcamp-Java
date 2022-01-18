package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        
        System.out.println("Sum is: " + sum(n1, n2));
    }
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
