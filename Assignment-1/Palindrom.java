package dsa_bootcamp;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        int r, sum=0, temp, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find it is Palindrom or not: ");
        num = sc.nextInt();
        
        temp = num;
        while(num>0){
            r = num % 10;
            sum = (sum*10) + r;
            num = num / 10;
        }
        if(temp == sum){
            System.out.println("Palindrom number");
        }
        else{
            System.out.println("Not Palindrom number");
        }
    }
}
