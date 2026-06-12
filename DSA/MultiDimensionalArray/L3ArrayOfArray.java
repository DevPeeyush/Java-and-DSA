package MultiDimensionalArray;

public class L3ArrayOfArray {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6}};
        for(int[] ele : arr){
            for(int x : ele) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
