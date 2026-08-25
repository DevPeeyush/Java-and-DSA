package DSA.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class L6KClosestPointToOrigin {

    // Make Triplet static because main() is static
    static class Triplet implements Comparable<Triplet> {
        int x;
        int y;
        int d;

        Triplet(int d, int x, int y) {
            this.d = d;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Triplet t) {
            return this.d - t.d;
        }
    }

    public static void main(String[] args) {

        int[][] points = {{3, 3}, {5, -1}, {-2, 2}};

        int n = points.length;
        int k = 2;

        PriorityQueue<Triplet> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int dist = x * x + y * y;

            pq.add(new Triplet(dist, x, y));

            if (pq.size() > k)
                pq.remove();
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {

            Triplet t = pq.remove();

            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }

        // Print the answer
        for (int[] ele : ans) {
            System.out.println("[" + ele[0] + ", " + ele[1] + "]");
        }
    }
}