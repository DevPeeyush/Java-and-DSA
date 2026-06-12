package MultiDimensionalArray;

public class L10SpiralPrinting {
    public static void use(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30},{31,32,33,34,35}};
        int m = arr.length, n = arr[0].length;
        System.out.println("Matrix is : ");
        use(arr);

        int minr = 0 , maxr = m-1;
        int minc = 0 , maxc = n-1;

        System.out.println(" Spiral Matrix is : ");
        while(minr<=maxr && minc <=maxc){
            
            // Left to Right
            for(int j = minc ; j<=maxc ; j++){
                System.out.print(arr[minr][j]+" ");
            }minr++;

            // Top to Bottom
            if(minr>maxr || minc>maxc) break;
            for (int i = minr; i<=maxr ; i++) {
                System.out.print(arr[i][maxc]+" ");
            }maxc--;

            // Right to Left
            if(minr>maxr || minc>maxc) break;
            for(int j = maxc ; j>=minc ; j--){
                System.out.print(arr[maxr][j]+" ");
            }maxr--;

            // Bottom to Top
            if(minr>maxr || minc>maxc) break;
            for (int i = maxr; i>=minr ; i--) {
                System.out.print(arr[i][minc]+" ");
            }minc++;
        }
    }
}
