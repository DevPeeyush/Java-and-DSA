package DSA.DyanmicProgramming;
/*      Knapsack using recursion      */
public class L4Knapsack {
    public static int profit(int i, int[] wt, int[] price, int C){
        // i is index
        // int[] wt is weight of element
        // int[] price is value(price) of element
        // c stands for capacity
        if(i==wt.length) return 0;
        int skip = profit(i+1,wt,price,C);
        if(wt[i]>C) return skip;
        int pick = price[i] + profit(i+1,wt,price,C-wt[i]);
        return Math.max(pick,skip);
    }
    public static void main(String[] args) {
        int[] wt = {1,2,8,10};
        int[] price = {5,3,9,16};
        int c = 8;
        System.out.println("Max profit is : "+profit(0,wt,price,c));
    }
}
