package Lecture.Conditionals_Loops;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int rem, count, n;
        
        count = 0;
        while(num>0){
            rem = num % 10;
            if(rem == 3){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
