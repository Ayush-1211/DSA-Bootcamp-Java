import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Ayush Prajapati";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());

        System.out.println(name.indexOf('j'));

        System.out.println("      Ayush          ".strip());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
