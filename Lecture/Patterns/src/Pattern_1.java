/*

How to approach::
    1 ---> no. of lines = no. of rows = no. of times outer loop will run

    2 ---> Identify for every row no.
           i) How many cols are there
          ii) Types of elements in cols

    3 ---> What do you need to print

*/


public class Pattern_1 {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
