package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int sub = sc.nextInt();
        System.out.println("Enter your marks: ");
        double sum = 0;
        for(int i=0; i<sub; i++){
            double marks = sc.nextDouble();
            sum += marks;
            
        }
        double average = sum / sub;
        System.out.println("Average is: "+average);
        
    }
}
