package Question.java;

public class Predict {
    public static void main(String[] args) {
        // When x = y continue with the statement an form coordinate
        int x = 4, y = 0;
        while (x >= 0) {
            x--;
            y++;
            if (x == y) continue;
            else System.out.println(x + " " + y);
        }
    }
}

