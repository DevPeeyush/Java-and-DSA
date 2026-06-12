package Recursion;

import java.util.Scanner;

public class L8MazePath {
//    Using four varibles for row and column
    public static int maze(int row , int col , int r , int c){
        // Base case
        if (row == r || col == c) return 1;
        // if (row == r && col == c) return 1;
        // if (row > r || col > c) return 0;

        // Recursive calls for down and right moves
        int downways = maze(row + 1 , col , r , c);
        int rightways = maze ( row , col + 1 , r , c);
        return downways + rightways;
    }
//  Using two variables to keep track of current position
    public static int maze2( int r , int c){
        // Base case
        if (r == 1 || c == 1) return 1;
        // Recursive calls for down and right moves
        int downways = maze2( r , c-1);
        int rightways = maze2( r-1 , c);
        return downways + rightways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row : ");
        int r = sc.nextInt();
        System.out.print("Enter the value of column : ");
        int c = sc.nextInt();
        System.out.println(("Number of ways to reach at end : "+maze(1,1,r,c)));
        System.out.println(("Number of ways to reach at end : "+maze2(r,c)));
    }
}
