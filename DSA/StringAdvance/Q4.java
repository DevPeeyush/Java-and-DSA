package StringAdvance;

import java.util.Scanner;

public class Q4 {
    // Given a string consisting lower case alphabets. Print the character which is occurring most number of times.
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)ch- 97;
            freq[idx]++;
        }
        int maxFreq = -1;
        for (int i = 0; i <freq.length ; i++) {
            maxFreq = Math.max(maxFreq,freq[i]);
        }
        for (int i = 0; i <freq.length ; i++) {
            if(freq[i]==maxFreq){
                char ch =(char)(i+97);
                System.out.println(ch+" ");
            }
        }
    }
}
