package Lecture.Functions;
public class Parameters_String {
    public static void main(String[] args) {
        String personalised = greet("Ayush Prajapati");
        System.out.println(personalised);
    }
    static String greet(String name){
        String message = "Hello " + name;
        return message;
    }
}
