package dsa_bootcamp.assignment3;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        vote(age);
    }
    static void vote(int age){
        if(age>=18){
            System.out.println("You are eligible fot voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
    }
}
