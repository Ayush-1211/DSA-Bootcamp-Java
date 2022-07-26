public class Nto1_OnetoN {
    public static void main(String[] args) {
        both(5);
    }
    static void both(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
