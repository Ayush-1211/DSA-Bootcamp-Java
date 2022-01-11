package SwitchCase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();
        
        switch(empId){
            case 1 -> System.out.println("Ayush Prajapati");
            case 2 -> System.out.println("Anand Suthar");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch(department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter Correct EmpID");
        }
    }
}
