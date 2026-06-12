package Array;

import java.util.ArrayList;

public class L7BasicOfArraylist
{
    public static void main(String[] args) {
        //Syntax : ArrayList<DataType> array_name = new ArrayList<>(CapacityOfArray);
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); // Initialize
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        //Size of an array is
        System.out.println("Size of an array is : " + arr.size());

        System.out.println("Array is : "+arr); //Method 1 to print an array

        System.out.print("Array is : ");
        for (int i = 0; i <6 ; i++) {   // Method 2 to print an array
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("\n");

        System.out.print("Update array is : ");
        arr.set(2,100);//Modify the value
        for (int i = 0; i < 6; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("\n");

        System.out.print("New Update array is : ");
        arr.add(3000); // Push back
        System.out.println(arr);
//        for (int i = 0; i < arr.size() ; i++) {
//            System.out.print(arr.get(i) + " ");
//        }
        System.out.println();

        System.out.println("New Size of an array : " + arr.size());
    }
}
