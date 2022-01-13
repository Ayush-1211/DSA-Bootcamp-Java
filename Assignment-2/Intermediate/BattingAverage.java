package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Runs: ");
        int runs = sc.nextInt();
        System.out.println("Enter number of smatches");
        int matches=sc.nextInt();
        System.out.println("Enter number of not-out matches");
        int notout=sc.nextInt();
        int outmatches=matches-notout;
        double baverage=runs/outmatches;
        System.out.println("Batting Average= "+baverage);
    }
}
