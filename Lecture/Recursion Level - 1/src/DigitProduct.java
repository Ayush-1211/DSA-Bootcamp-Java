public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(digitProd(1234));
    }
    static int digitProd(int n){
        if(n % 10 == n){
            return n;
        }
        return (n % 10) * digitProd(n / 10);
    }
}
