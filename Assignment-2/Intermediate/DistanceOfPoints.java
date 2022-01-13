package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class DistanceOfPoints {
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        double distance = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of first point (x1,y1): ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter the coordinates of second point (x2,y2): ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The distance between two point is: " + distance);
    }
}
