package Lecture.LinearSearch;
public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 25, 3, 4, 67, -1, 45, 30, 27, 17};
        int target = 67;
        System.out.println(range(nums, target, 1, 6));
    }
    static int range(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index=start; index<=end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
