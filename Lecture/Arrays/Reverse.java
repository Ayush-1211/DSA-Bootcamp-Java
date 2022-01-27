package Lecture.Arrays;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,10};
        
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            swapping(arr, start, end);
            start++;
            end--;
        }
    }
    
    static void swapping(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
