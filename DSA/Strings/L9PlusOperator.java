package Strings;

public class L9PlusOperator {
    public static void main(String[] args) {
        String x = "Peeyush";
        String y = "abcd";
        x = x + 250; //Peeyush250
        x = 10 + x ;
        System.out.println(x);
        System.out.println(10+20+y);
        System.out.println(y+10+20);
        System.out.println(y+(10+20));
    }
}
