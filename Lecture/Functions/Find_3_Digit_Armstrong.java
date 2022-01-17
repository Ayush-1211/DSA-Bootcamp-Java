package Lecture.Functions;
public class Find_3_Digit_Armstrong {
    public static void main(String[] args) {
        for(int i=100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int r = n % 10;
            n = n /10;
            sum = sum + (r*r*r);
        }
        return sum == original;
    }
}
