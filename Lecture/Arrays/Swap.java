package Lecture.Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        swapping(arr, 1, 2);
        
        System.out.println(Arrays.toString(arr));
    }
    static void swapping(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
