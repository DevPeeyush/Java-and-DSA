package Question.java;

import java.util.Scanner;

public class GreatestAmoungThree {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int a = ns.nextInt();
        System.out.print("Enter n2 : ");
        int b = ns.nextInt();
        System.out.print("Enter n3 : ");
        int c = ns.nextInt();
//        if (a>b && a>c)
//            System.out.println("n1 is greatest among three ");
//        else if (b>a && b>c)
//            System.out.println("n2 is greatest among three ");
//        else
//            System.out.println("n3 is greatest among three ");
        if(a>b)
        {
            if(a>c)
                System.out.println("a is greatest ");
        } else if (b>a){
            if(b>c)
                System.out.println("b is greatest");
        }else if(c>a)
            System.out.println("c is greatest ");
    }
}
