public class Pattern_3 {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=n; col>=row; col--){        // for(int col=1; col<=n-row+1; col++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
