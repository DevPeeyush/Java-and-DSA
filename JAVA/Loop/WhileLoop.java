package Loop;

import java.util.Scanner;

public class WhileLoop {
    /*   Syntax of while loop
int i =;
while(){
    //code
    i++;
    */
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = ns.nextInt();
        int i =1;
        while(i<=10){
            System.out.println(i*n);
            i++;
        }
    }
}
