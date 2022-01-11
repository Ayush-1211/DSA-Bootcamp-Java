package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class IsoscelesTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of same sided: ");
        double side = sc.nextDouble();
        System.out.println("Enter the lenght of base: ");
        double base = sc.nextDouble();
        
        double area = (base/4) * Math.sqrt((4*side*side) - (base * base));
        
        System.out.println("The are of Isosceles Triangle is: " + area);
    }
}
