package Lecture.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_of_Objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] name = new String[5];
        
        for(int i=0; i<name.length; i++){
            name[i] = sc.next();
        }
        System.out.println(Arrays.toString(name));
        
        name[1] = "Ayush";
        System.out.println(Arrays.toString(name));
    }
}
