package Question.java;

import java.util.Scanner;

public class SP_and_CP {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the Selling price :");
        double SP = sn.nextDouble();
        System.out.print("Enter the cost price : ");
        double CP = sn.nextDouble();
        if(SP>CP) {
            System.out.println("PROFIT");
            System.out.println("Profit is : "+(SP-CP));
        }if(CP==SP)
            System.out.println("No profit & loss");
        if (CP>SP){
            System.out.println("LOSS");
            System.out.println("Loss is : "+(CP-SP));
        }

    }
}
