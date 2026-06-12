package StringAdvance;

public class L3Equalto {
    public static void main(String[] args) {
        String a = "abcxyz";
        String b = "abc";
        b = b + "xyz";
        System.out.println(a==b); // This check the address of string
        System.out.println(a.equals(b));  // This will check the single-single character of string d
    }
}
