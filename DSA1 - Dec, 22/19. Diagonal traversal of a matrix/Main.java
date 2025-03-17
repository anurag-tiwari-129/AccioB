// sitaram
// 17/03/2025
// in class
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        ArrayList<Integer> res = diagonalTraversal(mat, n);
        for (Integer x : res)
            System.out.print(x + " ");
    }
    public static ArrayList<Integer> diagonalTraversal(int[][] mat, int n) {
        // your code here

        ArrayList<Integer> ans = new ArrayList<>();

        // 1st way, using for loop ||------------------------------------
        // upper triangle ||---------------------------------------------
        for(int col=n-1;col>=0;col--)
            for(int row=0;row<n;row++){
                // check the limit, n = 3
                // 1 + 2 = 3
                // [13, 24, 23](out of limits)
                if(row + col >= n) break; 

                // give value diagonally
                // [0][0 + 2] = [0][2]
                // [0][0 + 1] = [0][1]
                // [1][1 + 1] = [1][2]

                //  [00,  01,  02]
                //  [__,  11,  12]
                //  [__,  __,  22]
                ans.add(mat[row][row + col]); 
            }
        // lower triangle ||---------------------------------------------
        for(int col=1;col<n;col++)
            for(int row=col;row<n;row++){
                // [1][1 - 1] = [1][0]
                // [2][2 - 1] = [2][1]
                
                //  [__,  __,  __]
                //  [10,  __,  __]
                //  [20,  21,  __]
                ans.add(mat[row][row - col]);
            }
        //---------------------------------------------------------------

        // 2nd way, using while loop ||----------------------------------
        // upper triangle ||---------------------------------------------
        for(int col=n-1;col>=0;col--){
            int i = 0;
            int j = col;
            while(i < n && j < n){
                ans.add(mat[i][j]);
                i++;
                j++;
            }
        }
        // lower triangle ||---------------------------------------------
        for(int row=1;row<n;row++){
            int j = 0;
            int i = row;
            while(i < n && j < n){
                ans.add(mat[i][j]);
                i++;
                j++;
            }
        }
        return ans;
    }
}