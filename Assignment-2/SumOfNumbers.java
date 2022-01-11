package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers
        int num, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        do{
            num = sc.nextInt();
            sum = sum + num;
        }while(num != 0);
        System.out.println("Sum: " + sum);
    }
}
