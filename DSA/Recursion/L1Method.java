package Recursion;

public class L1Method {
    public static void mango() {
        System.out.println("I am in mango function");
    }
    public static void banana() {
        System.out.println("I am in banana function");
        mango();
    }
    public static void apple() {
        System.out.println("I am in apple function");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("I am in main function");
        apple();
    }
}
