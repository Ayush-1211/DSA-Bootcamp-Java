package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Product: ");
        int price = sc.nextInt();
        double discount = 0;
        if(price > 1000){
            discount = price*0.1;
        }
        else if(price > 500){
            discount = price*0.2;
        }
        else{
            discount = price*0.3;
        }
        double total = price - discount;
        System.out.println("Original Price: " + price);
        System.out.println("Discount of Product is: " + discount);
        System.out.println("After discount Price: " + total);
            
    }
}
