// sitaram
// 17/03/2025
// in class
import java.io.*;
import java.util.*;
class Solution{
    static boolean special(int matrix[][], int n){
        // Write code here
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++){
                // diagonal element from left to right ||----------------
                if(i == j && matrix[i][j] == 0)
                    return false;
                // diagonal element from right to left ||----------------
                else if(i + j == n - 1 && matrix[i][j] == 0)
                    return false;
                // non diagonal element ||-------------------------------
                else if(i != j && i + j != n - 1 && matrix[i][j] != 0)
                    return false;
            }
        return true;
    }
}
class Main{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();
            Solution ob = new Solution();
            boolean ans = ob.special(matrix, n);
            System.out.println(ans);
        }
    }
}