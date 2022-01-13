package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power: ");
        int p = sc.nextInt();
        int power = 1;
        System.out.println(n + " of power " + p + " is: ");
        while(p!=0){
            power = power * n;
            p--;
        }
        System.out.println(power);
    }
}
