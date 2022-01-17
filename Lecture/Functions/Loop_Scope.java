package Lecture.Functions;
public class Loop_Scope {
    public static void main(String[] args) {
        int a = 10;
        for(int i=0; i<1; i++){
            System.out.println(a);
            a = 100;
            System.out.println(a);
        }
    }
}
