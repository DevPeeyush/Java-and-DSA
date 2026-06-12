package PatternPrinting.TrinaglePattern;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 0; i < rows; i++) {
            int values = (i+1)%2; // Start with 1 for even rows, 0 for add rows
            for (int j = 0; j < i; j++) {
                System.out.print(values+" ");
                values = 1- values; // TOGGLE B/W 0 AND 1
            }
            System.out.println();
        }
    }
}
//output
//        0
//        1 0
//        0 1 0
//        1 0 1 0
//        0 1 0 1 0
