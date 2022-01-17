package Lecture.Functions;
public class Block_Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Ayush";
        {
            a = 30;     // we can change value in block scope but we can't initialised variable again
            System.out.println(a);
            int c = 40;     // we can't use this variable outside this scope
            System.out.println(c);
            System.out.println(name);
        }
        int c = 100;    // Anything initialised inside the block, we can also initialise it outside the block also
        System.out.println(c);
        System.out.println(a);
        System.out.println(name);
    }
    
}
