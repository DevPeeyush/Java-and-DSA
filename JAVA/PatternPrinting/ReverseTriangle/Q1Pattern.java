package PatternPrinting.ReverseTriangle;

public class Q1Pattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
    }
}
