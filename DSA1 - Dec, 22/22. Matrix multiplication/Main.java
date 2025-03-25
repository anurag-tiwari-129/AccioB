// sitaram
// dsa-1: dec, 18/12/2022
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int[][] A = new int[p][q];
        for(int i = 0; i < p; i++)
            for(int j = 0; j < q; j++)
                A[i][j] = sc.nextInt();
        int[][] B = new int[q][r];
        for(int i = 0; i < q; i++)
            for(int j = 0; j < r; j++)
                B[i][j] = sc.nextInt();
        int[][] Ans = MatrixMultiplier(A, B);
        for(int i = 0; i < p; i++) {
            for(int j = 0; j < r; j++) 
                System.out.print(Ans[i][j] + " ");
            System.out.print("\n");
        }
    }
	public static int[][] MatrixMultiplier(int[][] A, int[][] B) {
        // Write your code here

        int row = A.length;
        int r_c = A[0].length; // B.length;
        int col = B[0].length;
        int [][] ans = new int[row][col];

        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                for(int k=0;k<r_c;k++)
                    // ans[0][2] += A[0][0] * B[0][2]
				    // ans[0][2] += A[0][1] * B[1][2]

                    ans[i][j] += A[i][k] * B[k][j];
                    // [r][c] = [r][r_c] * [r_c][c]
        return ans;
    }
}