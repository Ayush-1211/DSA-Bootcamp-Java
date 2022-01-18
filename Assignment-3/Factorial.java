package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        Factorial(n);
    }
    static void Factorial(int n){
        if(n==0 || n==1){
            System.out.println(n+" ! = 1");
        }
        else{
            System.out.print(n + "! = ");
            int ans = 1;
            while(n>1){
                System.out.print(n + " * ");
                ans *= n;
                n--;
            }
            System.out.println("1 = " + ans);
        }
    }
}
