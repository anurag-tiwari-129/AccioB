// sitaram
// dsa-1: dec, 09/12/2022
import java.util.*;
public class Main {
    static int[] calSum(int a[], int b[], int n, int m) {
        // your code here

        // initialization ||--------------------------------------------
        int len = Math.max(n, m) + 1;
        int ans[] = new int[len];
        int a_i = n - 1;
        int b_i = m - 1;
        int ans_i = len - 1;
        int carry = 0;

        // addition in arrays ||----------------------------------------
        while(a_i >= 0 || b_i >= 0){
            ans[ans_i] = carry;
            // add from last of 1st array ||----------------------------
            if(a_i >= 0){
                ans[ans_i] += a[a_i];
                a_i--;
            }
            // add from last of 2nd array ||----------------------------
            if(b_i >= 0){
                ans[ans_i] += b[b_i];
                b_i--;
            }
            // separate carry & one digit in cell ||--------------------
            carry = ans[ans_i] / 10;
            ans[ans_i] = ans[ans_i] % 10;
            ans_i--;
        }
        ans[ans_i] = carry;
        if(ans[0] != 0)
            return ans;

        // if 1st item is 0, remove it ||-------------------------------
        int new_ans[] = new int[len - 1];
        int j = len - 1;
        for(int i=len-2;i>=0;i--){
            new_ans[i] = ans[j];
            j--;
        }
        return new_ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) 
            arr1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) 
            arr2[i] = sc.nextInt();
        sc.close();
        int[] res = calSum(arr1, arr2, n1, n2);
        for (int i : res) 
            System.out.println(i);
    }
}