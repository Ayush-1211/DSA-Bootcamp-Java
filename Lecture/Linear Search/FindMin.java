package Lecture.LinearSearch;
public class FindMin {
    public static void main(String[] args) {
        int[] nums = {23, 25, 3, 4, 67, -1, 45, 30, 27, 17};
        System.out.println(min(nums));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
