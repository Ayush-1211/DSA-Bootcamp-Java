package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        int num,max=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        do{
            num = sc.nextInt();
            temp = num;
            if(temp>max){
                max = temp;
            }
        }while(num != 0);
        System.out.println("Maximum number is: " + max);
    }
}
