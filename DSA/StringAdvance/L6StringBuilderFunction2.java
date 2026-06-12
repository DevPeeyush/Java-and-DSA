package StringAdvance;

public class L6StringBuilderFunction2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Peeyush verma ");
        System.out.println(sb.append("Sharma"));// we can append a string
        System.out.println(sb.append(35)); // we can append a integer
        System.out.println(sb.append('v')); // we can append a character
        int[] arr = {1,2,3,4};
        System.out.println(sb.append(arr)); //we can append an array
        System.out.println(sb.deleteCharAt(4));
    }
}
