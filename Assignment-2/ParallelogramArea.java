package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height for the parellelogram: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        double area = base * height;
        
        System.out.println("Area of Parelleloggram is: " + area);
    }
}
