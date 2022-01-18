package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        boolean palindrome = isPalindrome(n);
        if(palindrome){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
    static boolean isPalindrome(int num){
        int temp = num;
        int sum = 0;
        while(num>0){
            int r = num % 10;
            sum = (sum*10) + r;
            num = num / 10;
        }
        return temp == sum;
    }
}
