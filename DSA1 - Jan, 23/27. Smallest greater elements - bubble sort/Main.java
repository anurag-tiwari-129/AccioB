// sitaram
// 24/04/2025
// in class
import java.util.*;
public class Main {
    public static int[] SmallestGreaterElements(int[] arr) {
        // Write your code here

        // 1st way, by bubble sort ||------------------------------------
        int N = arr.length;
        int[] tem = new int[N];
        for(int i = 0; i < arr.length; i++) 
            tem[i] = arr[i];

        // bubble sort ||------------------------------------------------
        for(int i=0;i<N-1;i++)
            for(int j=0;j<N-1-i;j++)
                if(tem[j] > tem[j + 1]){
                    int t = tem[j];
                    tem[j] = tem[j + 1];
                    tem[j + 1] = t;
                }

        // smallest greatest element ||----------------------------------
        for(int i=0;i<N;i++){
            boolean have = true;
            for(int j=0;j<N;j++)
                if(arr[i] < tem[j]){
                    arr[i] = tem[j];
                    have = false;
                    break;
                }
            if(have) arr[i] = -10000000;
        }
        return arr;
        //---------------------------------------------------------------

        // 2nd way. by logic ||------------------------------------------
        int n = arr.length;
        int []ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            // mini greater no in array
            int min = Integer.MAX_VALUE;

            // find mini greater no ||-----------------------------------
            for(int j=0;j<arr.length;j++)
                // cur > selected, && cur < mini 
                if(arr[j] > arr[i] && arr[j] < min)
                    min = arr[j];
            ans[i] = min;

            // if mini is not found ||-----------------------------------
            if(ans[i] == Integer.MAX_VALUE)
                ans[i] = -10000000;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }
    }
}  