package dsa_bootcamp.assignment2;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        long amount,deppercent,year,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        amount=sc.nextLong();
        System.out.println("Enter Depreciation percentage");
        deppercent=sc.nextLong();
        System.out.println("Enter  number of years");
        year=sc.nextLong();
        temp=amount;
        for(int i=0;i<year;i++){
            temp=((100-deppercent)*temp)/100;
        }
        System.out.println("After depreciation = "+temp);
    }
}
