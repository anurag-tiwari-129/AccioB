// sitaram
// 17/03/2025
import java.util.*;
public class Main {
    public static int maximaMinima(int[][] mat) {
        // Write code here

        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // find minimum in row ||-------------------------------
                int min = Integer.MAX_VALUE;
                for(int k=0;k<n;k++)
                    min = Math.min(min, mat[i][k]);

                // find maximum in column ||----------------------------
                int max = Integer.MIN_VALUE;
                for(int k=0;k<n;k++)
                    max = Math.max(max, mat[k][j]);
                
                // if both are equal, return ||-------------------------
                if(min == max)
                    return min;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}