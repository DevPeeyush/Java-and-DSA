package Array;

public class L14MergeToSortedArray {
    public static void main(String[] args) {
        int [] a = {11,33,35,40,48,56,60};
        int [] b = {12,14,22,35};
        int [] c = new int[a.length + b.length];
        int i = 0 , j = 0 , k = 0;
        // Merging
        System.out.print("Merged array is : ");
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i==a.length) {  // now take elements from a only
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){  // now take elements from b only
            while(i<a.length){
                c[k] = a[i];
                i++;k++;
            }
        }
        for(int ele : c){
            System.out.print(ele + " ");
        }

    }
}
