package Lecture.Functions;

import java.util.Arrays;

public class Variable_Arguments {
    public static void main(String[] args) {
        fun(22,3,4,6,7,9,33,5,77);
        fun2(10,20,"Ayush","Anand","Keval");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun2(int a, int b, String ...v){
        
    }
}
