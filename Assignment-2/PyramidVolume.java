package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class PyramidVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid: ");
        double height = sc.nextInt();
        System.out.println("Enter the width of the pyramid: ");
        double width = sc.nextInt();
        System.out.println("Enter the length of the pyramid: ");
        double length = sc.nextInt();
        double volume = (height * width * length) / 3;
        System.out.println("The volume of the pyramid is: " + volume);
    }
}
