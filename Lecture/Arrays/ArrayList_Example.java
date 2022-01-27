package Lecture.Arrays;
import java.util.*;
public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        System.out.println(list);
        System.out.println(list.contains(30));
        list.remove(2);
        System.out.println(list);
        
        // Input
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        
        // Get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
        
    }
}
