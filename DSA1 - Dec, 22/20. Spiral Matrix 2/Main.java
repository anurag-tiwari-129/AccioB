// sitaram
// 17/03/2025
import java.util.Scanner;
import java.util.Vector;
class Solution {
    public Vector<Integer> spiralMatrix2(Vector<Vector<Integer>> arr, int n, int m) {
        // write your code here

        Vector<Integer> ans = new Vector<>();
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        int count = n * m; // remove overread same element ||------------
        while(count > 0 && top <= bottom && left <= right){
            // in left, top to bottom ||---------------------------------
            for(int i=top;i<=bottom;i++){
                ans.add(arr.get(i).get(left));
                count--;
            }
            left++;
            // in bottom, left to right ||-------------------------------
            if(count > 0 && left <= right){
                for(int j=left;j<=right;j++){
                    ans.add(arr.get(bottom).get(j));
                    count--;
                }
                bottom--;
            }
            // in right, bottom to top ||--------------------------------
            if(count > 0 && top <= bottom){
                for(int i=bottom;i>=top;i--){
                    ans.add(arr.get(i).get(right));
                    count--;
                }
                right--;
            }
            // in top, right to left ||----------------------------------
            if(count > 0 && left <= right){
                for(int j=right;j>=left;j--){
                    ans.add(arr.get(top).get(j));
                    count--;
                }
                top++;
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Vector<Vector<Integer>> matrix = new Vector<>(n);
            for (int i = 0; i < n; i++) {
                Vector<Integer> row = new Vector<>(m);
                for (int j = 0; j < m; j++)
                    row.add(sc.nextInt());
                matrix.add(row);
            }
            Solution ob = new Solution();
            Vector<Integer> result = ob.spiralMatrix2(matrix, n, m);
            for (int i = 0; i < result.size(); i++) 
                System.out.print(result.get(i) + " ");
            System.out.println();
        }
    }
}