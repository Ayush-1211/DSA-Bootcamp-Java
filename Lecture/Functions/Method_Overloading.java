package Lecture.Functions;
public class Method_Overloading {
    public static void main(String[] args) {
        fun(40);
        fun("Ayush");
        int sum = fun(40,50);
        System.out.println(sum);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int fun(int a, int b){
        return a + b;
    }
}
