package StringAdvance;

public class L4StringBuilder {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        System.out.println("Length of a is : "+a.length());
        System.out.println("Capacity of a is : "+a.capacity());//By default capacity of StringBuilder is 16 and 3 is capacity give string

        StringBuilder b = new StringBuilder(10);
        System.out.println("Capacity of b is : "+b.capacity());

        StringBuilder c = new StringBuilder();
        System.out.println("Formation of empty string : "+c);
    }
}
