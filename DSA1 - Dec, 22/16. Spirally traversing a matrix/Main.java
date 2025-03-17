// sitaram
// dsa-1: dec, 15/12/2022
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]mat = new int[n][m];
        for(int i=0;i<n;++i)
            for(int j=0;j<m;++j)
                mat[i][j]=sc.nextInt();
        spirallyTraverse(mat);
    }
    public static void spirallyTraverse(int [][]mat) {
        // your code here
        
        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1;
        
        // 1st way, by direction ||--------------------------------------
        int dir = 0;
        while(top <= bottom && left <= right){
            // in top, left to right ||----------------------------------
            if(dir == 0){
                for(int j=left;j<=right;j++)
                    System.out.print(mat[top][j] + " ");
                top++; // dir = 1
            }
            // in right, top to bottom ||--------------------------------
            else if(dir == 1){
                for(int i=top;i<=bottom;i++)
                    System.out.print(mat[i][right] + " ");
                right--; // dir = 2
            }
            // in bottom, right to left ||-------------------------------
            else if(dir == 2){
                for(int j=right;j>=left;j--)
                    System.out.print(mat[bottom][j] + " ");
                bottom--; // dir = 3
            }
            // in left, bottom to top ||---------------------------------
            else{
                for(int i=bottom;i>=top;i--)
                    System.out.print(mat[i][left] + " ");
                left++; // dir = 0
            }
            // update direction ||---------------------------------------
            dir = (dir + 1) % 4;
        }
        // --------------------------------------------------------------

        // 2nd way ||----------------------------------------------------
        while(top <= bottom && left <= right){
            // in top, left to right ||----------------------------------
            for(int j=left;j<=right;j++){
                System.out.print(mat[top][j] + " ");
            }
            top++;
            // in right, top to bottom ||--------------------------------
            if(left <= right){
                for(int i=top;i<=bottom;i++)
                    System.out.print(mat[i][right] + " ");
                right--;
            }
            // in bottom, right to left ||-------------------------------
            if(top <= bottom){
                for(int j=right;j>=left;j--)
                    System.out.print(mat[bottom][j] + " ");
                bottom--;
            }
            // in left, bottom to top ||---------------------------------
            if(left <= right){
                for(int i=bottom;i>=top;i--)
                    System.out.print(mat[i][left] + " ");
                left++;
            }
        }
    }
}