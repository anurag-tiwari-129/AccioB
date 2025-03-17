// sitaram
// dsa-1: dec, 16/12/2022
import java.util.*;
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) 
                System.out.print(triangle.get(i).get(j) + " ");
            System.out.println();
        }
    }
	public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // write code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> prev = new ArrayList<>();
        prev.add(1);
        ans.add(prev);
        // numRows = 1 ||------------------------------------------------
        if(numRows == 1)
            return ans;
        // numRows > 1 ||------------------------------------------------
        for(int i=2;i<=numRows;i++){
            ArrayList<Integer> cur = new ArrayList<>();

            // at 0th index ||-------------------------------------------
            cur.add(1); 
            // at middle index ||----------------------------------------
            for(int j=1;j<=i-2;j++)
                // cur.add(prev.get(j - 1) + prev.get(j)); 
                cur.add(ans.get(i - 2).get(j - 1) + ans.get(i - 2).get(j));
            // at last index, (i - 1)th ||-------------------------------
            cur.add(1); 

            // // storing in 2D & updating prev ArrayList ||-------------
            // ans.add(cur);
            // prev = cur;
            ans.add(cur);
        }
        return ans;
    }   
}