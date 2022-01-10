package Lecture.Conditionals_Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a=0, b=1, count=2, temp;
        
        while(count <= n){
            temp = b;
            b = b + a;
            a = temp;
            temp = b;
            count++;
        }
        System.out.println(b);
    }
}
