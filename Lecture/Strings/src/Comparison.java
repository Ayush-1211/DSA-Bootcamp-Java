public class Comparison {
    public static void main(String[] args) {
        String a = "Ayush"; // this will create object in the string pool
        String b = "Ayush";
        System.out.println(a == b);

        String temp = a;
        System.out.println(temp == a);

        String c = new String("Ayush"); // this will create object outside the string pool
        String d = new String("Ayush");
        System.out.println(c == d);

        System.out.println(c.equals(d));    // equals method only checks the value of that object

        System.out.println(c.charAt(0));
    }
}
