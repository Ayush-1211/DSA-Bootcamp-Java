package Lecture.Functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
}
