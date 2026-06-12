import java.util.*;

class L9Leetcode901 {

    static class StockSpanner {

        Stack<int[]> st;
        int idx;

        public StockSpanner() {
            st = new Stack<>();
            idx = -1;
        }

        public int next(int price) {

            idx++;

            // Remove all smaller or equal prices
            while (!st.isEmpty() && st.peek()[0] <= price) {
                st.pop();
            }

            int span;

            // If no previous greater element
            if (st.isEmpty()) {
                span = idx + 1;
            } else {
                span = idx - st.peek()[1];
            }

            // Push current price and index
            st.push(new int[]{price, idx});

            return span;
        }
    }

    public static void main(String[] args) {

        StockSpanner sp = new StockSpanner();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Stock Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\n\nSpans:");

        for (int price : prices) {
            System.out.print(sp.next(price) + " ");
        }
    }
}