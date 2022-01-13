package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of kwh used: ");
        double kwh = sc.nextDouble();
        System.out.println("Enter the cost of the kwh: ");
        double cost = sc.nextDouble();
        System.out.println("Enter the number of days used: ");
        double days = sc.nextDouble();
        double bill = 0;
        
        if(kwh > 0 && cost > 0 && days > 0){
            bill = kwh * cost;
            bill = bill / days;
            System.out.println("The bill is: " + bill);
        }
        else{
            System.out.println("Invalid input!!");
        }
    }
}
