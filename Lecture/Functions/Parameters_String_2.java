package Lecture.Functions;

import java.util.Scanner;

public class Parameters_String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        String personalised = greet(name);
        System.out.println(personalised);
    }
    static String greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
