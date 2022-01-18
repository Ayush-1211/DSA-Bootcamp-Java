package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class PrimeInInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first and last numbers between which Prime numbers are required : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        print_prime(a, b);
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
    static void print_prime(int a, int b){
        System.out.println("Prime Numbers Between "+a+" and "+b+" : ");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
