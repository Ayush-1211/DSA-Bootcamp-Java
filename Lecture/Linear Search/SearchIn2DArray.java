package Lecture.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {24, 2, 45},
            {12, 46, 23, 40},
            {34, 7, 8, 90},
            {55, 14, 20}
        };
        int target = 8;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Max Value is: " + max(arr));
    }
    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
