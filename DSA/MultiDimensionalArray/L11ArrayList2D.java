package MultiDimensionalArray;
import java.util.ArrayList;
import java.util.List;
public class L11ArrayList2D {
    public static void main(String[] args) {
// Making of an Array List
        List<Integer> a = new ArrayList<>();
        a.add(10);a.add(20);a.add(30);a.add(40);

        List<Integer> b = new ArrayList<>();
        b.add(50) ; b.add(60); b.add(70);

        List<Integer> c = new ArrayList<>();
        c.add(80) ; c.add(90);

        List<Integer> d = new ArrayList<>();

        List<List<Integer>> l = new ArrayList<>();
        l.add(a) ; l.add(b) ; l.add(c) ;l.add(d);

        for (int i = 0; i <l.size() ; i++) {
            for (int j = 0; j <l.get(i).size() ; j++) {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
/*
add()  = add from back
get()
size()
remove() = remove from back
clear()  =  Use for clear the array
isEmpty() = Cheak array is empty or not
Contains() = cheaking the element in the array list
IndexOf()
toArray()  = Convert 1D array list into array 
 */