package Strings;

public class L12InterningAndNewKeyword {
    public static void main(String[] args) {
        String a = "Peeyush";
        // Peeyush -> Aeetsh;
//        a.charAt(0) = 'A';
//        a.charAt(3) = 't';  // Both shoes error because changes in individual character in string is not possible
//        String a = "Madhav";
//        System.out.println(a);
        String t = "Peeyush";
        System.out.println(t);
        String b = new String("Peeyush");
        System.out.println(b);
    }
}
