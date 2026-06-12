package StringAdvance;

public class L7StringBuilderFunction3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.delete(2,5));
        //System.out.println(sb.charAt(2,"a"));// It replace the char at 2 index with p
        System.out.println(sb.insert(2,"l"));// But make place at index and shift the character to next one
        // We can insert bool , int , char , double ,floot data type
        System.out.println(sb.reverse());

    }
}
