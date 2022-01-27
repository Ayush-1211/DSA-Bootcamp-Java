package Lecture.Arrays;

import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        System.out.println(arr[3]);
        
        // Input using for loop
        System.out.println("Enter your elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Your elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("");
        System.out.println("For-Each loop: ");
        for(int num: arr){
            System.out.print(num + " ");    // Here num represents element of an array
        }
    }
}
