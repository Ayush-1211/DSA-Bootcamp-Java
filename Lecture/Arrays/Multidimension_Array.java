package Lecture.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr1 = new int[3][];    // Row value is mendatory, but column value is not
        
        int[][] arr2 = {
            {1,2,3},    // 0th index
            {4,5,6},    // 1st index
            {7,8,9}     // 2nd index -> arr2[2][1] = {8}
        };
        
        int[][] arr3 = new int[3][3];
        // Input
        for(int row=0; row<3; row++){
            for(int col=0; col< arr3[row].length; col++){
                arr3[row][col] = sc.nextInt();
            }
        }
        
        // Output Method 1
        for(int row=0; row<3; row++){
            for(int col=0; col< arr3[row].length; col++){
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        // Output Method 2
        for(int row=0; row<arr3.length; row++){
            System.out.println(Arrays.toString(arr3[row]));
        }
        
        System.out.println("");
        
        // Output Method 3
        for(int[] a : arr3){
            System.out.println(Arrays.toString(a));
        }
    }
}
