package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class Subtract_ProductAndSum_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int n = sc.nextInt();
        int product = 1;
        int sum = 0;
        
        while(n>0){
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }
        System.out.println("Result is: " + (product - sum));
    }
}
