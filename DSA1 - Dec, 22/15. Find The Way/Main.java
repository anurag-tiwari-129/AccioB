// sitaram
// dsa-1: dec, 15/12/2022
import java.util.*;
public class Main {
    public static int[] findTheWay(int[][] matrix) {
        // Write code here

        // initialization ||--------------------------------------------
        int ans[] = new int[2];
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = 0;
        int dir = 0;
        
        // mouse in a matrix ||-----------------------------------------
        while(i >= 0 && i < n && j >= 0 && j < m){
            // current location ||--------------------------------------
            ans[0] = i;
            ans[1] = j;

            // if at 0, move forward ||---------------------------------
            if(matrix[i][j] == 0){
                if(dir == 0) j++; // right
                if(dir == 1) i++; // down
                if(dir == 2) j--; // left
                if(dir == 3) i--; // up
            }

            // if at 1, turn right ||-----------------------------------
            else{
                if(dir == 0){ // right to down
                    dir = 1;
                    i++;
                }
                else if(dir == 1){ // down to left
                    dir = 2;
                    j--;
                }
                else if(dir == 2){ // left to up
                    dir = 3;
                    i--;
                }
                else if(dir == 3){ // up to right
                    dir = 0;
                    j++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result[] = findTheWay(matrix);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}