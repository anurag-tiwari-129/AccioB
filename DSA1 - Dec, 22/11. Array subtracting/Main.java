// sitaram
// 21/02/2025
// in class
import java.util.*;
public class Main {
    static int[] subtract(int[] n1, int[] n2) {
        // your code here

        // initialization ||--------------------------------------------
        int ans[] = new int[Math.max(n1.length, n2.length)];
        int len = ans.length - 1;
        int dif = 0;

        int max[] = new int[Math.max(n1.length, n2.length)];
        int min[] = new int[Math.min(n1.length, n2.length)];
        int max_i = max.length - 1;
        int min_i = min.length - 1;

        // arrange array according to their value ||--------------------
        // (n2 = 321 > n1 = _21) || (n2 = 3_21 > n1 = 1_21)
        if((n2.length > n1.length) || (n2.length == n1.length && n2[0] > n1[0])){
            for(int i=0;i<n2.length;i++)
                max[i] = n2[i];
            for(int i=0;i<n1.length;i++)
                min[i] = n1[i];
        }
        // n1 > n2
        else{
            for(int i=0;i<n1.length;i++)
                max[i] = n1[i];
            for(int i=0;i<n2.length;i++)
                min[i] = n2[i];
        }

        // subtraction ||-----------------------------------------------
        while(max_i >= 0 || min_i >= 0){
            ans[len] = dif;
            dif = 0;
            
            // if dif = -1, it minus the max[max_i] in ans[len] ||------
            if(max_i >= 0){
                ans[len] += max[max_i];
                max_i--;
            }
            
            // minus ans[len] with min[min_i] ||------------------------
            if(min_i >= 0){
                // min[min_i] have bigger value then take carry
                if(ans[len] < min[min_i]){
                    dif = -1;
                    ans[len] += 10;
                }
                ans[len] -= min[min_i];
                min_i--;
            }
            len--;
        }
        
        // remove starting 0s ||----------------------------------------
        int ind = -1;
        for(int i=0;i<ans.length;i++)
            if(ans[i] != 0){
                ind = i;
                break;
            }
        len = ans.length - ind;
        int ans_new[] = new int[len];
        for(int i=0;i<len;i++)
            ans_new[i] = ans[i + ind];
        
        // if n2 > n1, put "-" in ans [] ||-----------------------------
        if((n2.length > n1.length) || (n2.length == n1.length && n2[0] > n1[0])){
            ans_new[0] *= -1;
        }
        return ans_new;
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
        int[] res = subtract(arr1, arr2);
        for (int i : res) 
            System.out.println(i);
    }
}