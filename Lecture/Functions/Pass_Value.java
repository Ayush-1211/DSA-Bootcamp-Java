package Lecture.Functions;
public class Pass_Value {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);
        
        String name = "Ayush Prajapati";
        changename(name);
        System.out.println(name);
    }
    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
    static void changename(String naam){
        naam = "Anand Suthar";  // Creating a new object
    }
}
