package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println("The sum of N natural numbers: " + ans);
    }
    static int sum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}
