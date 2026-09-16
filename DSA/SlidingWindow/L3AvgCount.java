package DSA.SlidingWindow;

public class L3AvgCount {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,8};
        int n = arr.length;
        int count = 0;
        int threshold = 4, k =3, i =0, j=k-1;
        int sum = 0;
        for(int a=0;a<=k-1;a++){ // k times
            sum += arr[a];
        }
        int avg = sum/k;
        if(avg>=threshold) count++;
        i++; j++;
        while(j<n){ // n-k times
            sum = sum - arr[i-1] + arr[j];
            if(sum/k>=threshold) count++;
            i++; j++;
        }

        System.out.println(count);
    }
}
