package Lecture.Functions;
public class Shadowing {
    static int x = 90;  // this will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x;
        //System.out.println(x);  // Scope will begin when value is initialised
        x = 20;
        System.out.println(x);  // 20
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
