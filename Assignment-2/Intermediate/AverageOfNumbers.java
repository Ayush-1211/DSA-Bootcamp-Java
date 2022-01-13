package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers: ");
        for(int i=1; i<=n; i++){
            int num = sc.nextInt();
            sum += num;
        } 
        double average = sum / n;
        System.out.println("Average is: " + average);
    }
}
