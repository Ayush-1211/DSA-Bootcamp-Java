package dsa_bootcamp; 

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Enter Operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        if(op == '+'){
            double result = num1 + num2;
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
        else if(op == '-'){
            double result = num1 - num2;
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
        else if(op == '*'){
            double result = num1 * num2;
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
        else if(op == '/'){
            double result = num1 / num2;
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        }
        
        
    }
}
