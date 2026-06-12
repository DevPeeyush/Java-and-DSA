package Strings;

public class L4BuildStringMethod2 {
    public static void main(String[] args) {
        String str = "Peeyush verma ";
        System.out.println(str);
        System.out.println("Index of e is : " + str.indexOf('e'));
        System.out.println("Index of y is  : " + str.indexOf('y'));
        System.out.print("index of e from last : "+str.lastIndexOf('e' ));

        String a = "abc";
        String b = "xpc";
        System.out.println("compare of a and b is : " +a.compareTo(b));
        // In compareTo we check string a and b in dictionary manner

        System.out.println("erma contain in a string : "+str.contains("erma"));   // Give out in True/False that sub string is in the main string
        System.out.println(str.endsWith("ma")); // Sub string in the main string in the end of string

        String d = "Peeyush VERMa Is in THE 2nd YEAR ";
        System.out.println(d.toLowerCase()); // Convert string into lower case
        System.out.println(d.toUpperCase()); // conver string into upper case
        System.out.println(a.concat(b)); // add to stings
    }
}

