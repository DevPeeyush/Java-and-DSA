package Variable;

public class UpdatingVariable {
    public static void main(String[] args) {
        int x =5;
        System.out.println(x);
        x = 10;
        System.out.println(x);
        x = x+50;
        System.out.println(x);
        x = x-25;
        System.out.println(x);
        x +=10;                 // Shortcut of operators
        System.out.println(x);
        x*=2;
        System.out.println(x);
        x-=1;
        System.out.println(x);
    }
}
