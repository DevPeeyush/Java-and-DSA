package PatternPrinting.TrinaglePattern;

public class FlaydTriangle {
    public static void main(String[] args) {
        int number = 1;
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
//Output
//        1
//        2 3
//        4 5 6
//        7 8 9 10