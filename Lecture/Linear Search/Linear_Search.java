package Lecture.LinearSearch;
public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {23, 25, 3, 4, 67, -1, 45, 30, 27, 17};
        int target = 45;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        int ans2 = linearSearch2(nums, target);
        System.out.println(ans2);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}
