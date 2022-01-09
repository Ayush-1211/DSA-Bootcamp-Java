package dsa_bootcamp;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        
        if(num1>num2){
            System.out.println(num1 + " is the largest number!");
        }
        else{
            System.out.println(num2 + " is the largest number!");
        }
    }
}
