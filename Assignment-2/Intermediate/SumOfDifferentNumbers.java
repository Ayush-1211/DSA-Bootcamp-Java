package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class SumOfDifferentNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum_n = 0;
        long sum_e = 0;
        long sum_o = 0;
        System.out.println("Enter numbers: ");
        int temp = sc.nextInt();
        while(temp!=0){
            if(temp<0){
                sum_n += temp;
            }
            if(temp>0){
                if(temp%2==0){
                    sum_e += temp;
                }
                else{
                    sum_o += temp;
                }
            }
            temp = sc.nextInt();
        }
        System.out.println("Sum of Negative numbers : "+sum_n);
        System.out.println("Sum of Positive odd numbers : "+sum_o);
        System.out.println("Sum of Positive even number : "+sum_e);
    }
}
