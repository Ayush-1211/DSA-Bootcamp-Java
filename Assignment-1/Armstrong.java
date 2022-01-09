package dsa_bootcamp;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        int m=n, sum=0, r;
        while(n>0){
            r = n % 10;
            n = n / 10;
            sum = sum + r*r*r;
        }
        if(sum == m){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
