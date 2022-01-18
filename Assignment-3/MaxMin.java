package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int n3 = sc.nextInt();
        
        System.out.println("Maximum number is: " + max(n1,n2,n3));
        System.out.println("Minimum number is: " + min(n1,n2,n3));
    }
    static int max(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }
    static int min(int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
