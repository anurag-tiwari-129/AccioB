// sitaram
// dsa-1: jan, 20/01/2023
import java.io.*;
import java.util.*;
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix, int m, int n) {
        // write code here
        
        // 1st way, by moving diagonally ||------------------------------
        // flow on 1st row from right to left ||-------------------------
        int col = n - 1;
        while(col >= 0){
            int tem = matrix[0][col];
            int j = col;
            int row = 0;
            while(row < m && j < n){
                if(matrix[row][j] != tem)
                    return false;
                row++;
                j++;
            }
            col--;
        }
        // flow on 1st column from top to down ||------------------------
        int row = 1;
        while(row < m){
            int tem = matrix[row][0];
            int i = row;
            col = 0;
            while(col < n && i < m){
                if(matrix[i][col] != tem)
                    return false;
                i++;
                col++;
            }
            row++;
        }
        //---------------------------------------------------------------

        // 2nd way, checking diagonal elements ||------------------------
        for(int i=0;i<m-1;i++)
            for(int j=0;j<n-1;j++)
                // check diagonal(left to right) elements are not equal 
                if(matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
        // --------------------------------------------------------------

        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] A = new int[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        boolean ans = Obj.isToeplitzMatrix(A, m, n);
        System.out.println(ans);
    }
}