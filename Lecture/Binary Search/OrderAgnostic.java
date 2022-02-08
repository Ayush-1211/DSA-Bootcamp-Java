package Lecture.BinarySearch;
public class OrderAgnostic {
    public static void main(String[] args) {
        //int[] arr = {-18, -10, -5, 0, 10, 12, 15, 34, 56, 80, 89};    Ascending
        int[] arr = {99, 80, 78, 65, 55, 34, 12, 10, 8, 5, 3, 1};   // Descending
        int target = 78;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        boolean isAsc;
        isAsc = arr[start] < arr[end];
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                return mid;
            }
            
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;    
    }
}

