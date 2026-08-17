package DSA.DyanmicProgramming;

public class L5SubSet {
    private static boolean subset(int i, int[] arr, int target) {
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        boolean skip = subset(i+1,arr,target);
        if(target-arr[i]<0) return skip; // Only valid for +ve numbers
        boolean pick = subset(i+1,arr,target-arr[i]);
        return pick || skip;
    }
    public static void main(String[] args) {
        int[] arr = {8,-1,2,4};
        int target = 7;
        System.out.println(subset(0,arr,target));
    }
}
