package StringAdvance;

public class L1ModiefyString {
    public static void main(String[] args) {
        String s = "hello";
        // hello -> heylo convert it into this
        s = s.substring(0,2)+"y"+s.substring(3);
        System.out.println("Modeify Stirng is : "+s);
    }
}
