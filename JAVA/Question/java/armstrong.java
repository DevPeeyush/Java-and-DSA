package Question.java;

import java.util.*;

class Armstrong {
    public static void main(String[] args) {
        int sum = 0, x, temp;
        int n = 153;
        temp = n;

        while (n > 0) {
            x = n % 10;
            sum = sum + (x * x * x);
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}