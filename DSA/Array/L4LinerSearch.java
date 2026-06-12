package Array;

import java.util.Scanner;

public class L4LinerSearch {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.print("Enter the searching element : ");
        int x = ns.nextInt();

        System.out.print("Enter the size of array : ");
        int n = ns.nextInt();

        int[] array = new int[n];

        System.out.println("Array is : ");
        for (int i = 0; i < n; i++) {
            array[i] = ns.nextInt();
        }

        boolean flag = false; // element is not found
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                flag = true; // element is found
                break;
            }
        }
        if (flag == true) System.out.println("Element is found ");
        else System.out.println("Element is not found ");

    }
}


