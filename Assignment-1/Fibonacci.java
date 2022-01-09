package dsa_bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=1, n2=2, n3, i, count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Count number: ");
        count = sc.nextInt();
        
        System.out.print("Fibonacci Series is: " + n1 + " " + n2);
        
        for(i=2; i<count; i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
