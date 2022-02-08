package Lecture.BinarySearch;
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-18, -10, -5, 0, 10, 12, 15, 34, 56, 80, 89};
        int target = 34;
        int ans = binary(arr, target);
        System.out.println(ans);
    }
    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            // int mid = (start+end)/2;     This may exceeds the range of int 
            int mid = start + (end - start) / 2;
            
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
