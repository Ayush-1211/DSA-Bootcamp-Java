package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        
        for (int i=1; i<=num; i++){
            if(num % i == 0){
                System.out.println(" " + i);
            }
        }
    }
}
