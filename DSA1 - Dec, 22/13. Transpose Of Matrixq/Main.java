// sitaram
// dsa-1: dec, 14/12/2022
import java.util.*;
import java.io.*;
class Solution {
    public int[][] matrixTranspose(int[][] mat, int n) {
        // Write your code here

        // for transpose, swap half diagonal matrix ||-------------------
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tem = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tem;
            }
        }
        return mat;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        int[][] ans = Obj.matrixTranspose(matrix, n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println("");
        }
        sc.close();
    }
}