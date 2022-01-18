// Lowest common factor 
package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("LCM: " + (num1*num2)/lcm(num1,num2));
    }
    static int lcm(int a, int b){
        if(b==0){
            return a;
        }
        return lcm(b,a%b);
    }
}
