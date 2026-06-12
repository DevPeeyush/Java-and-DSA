package Array;

import java.util.Scanner;

public class L2Input
{
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = ns.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array : ");
        int i;
        for(i = 0; i <= n - 1; ++i) {
            arr[i] = ns.nextInt();
        }

        for(i = 0; i <= n - 1; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}

