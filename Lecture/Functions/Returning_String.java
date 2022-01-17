package Lecture.Functions;
public class Returning_String {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String greeting = "Hello, How are you?";
        return greeting;
    }
}
