package Lecture.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] rno1 = new int[10];   //Method 1
        int[] rno2 = {23,25,10,3,56};   //Method 2
        
        int[] roll; //Declaration of Array: roll is getting defined in the stack
        roll = new int[5];  // Initialisation: Actually here object is being created in the heap memory
        
        System.out.println(roll[0]);    // By default it is 0
        
        String[] names = new String[5];
        System.out.println(names[0]);   // By default it is null
    }
}
