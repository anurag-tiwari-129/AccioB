// sitaram
// 23/07/2025
import java.io.*;
import java.util.*;
public class Main {
    public static long ways(int n, int i){
        // Write your code here
        
        if(n < 0) return (long)0;
        if(n == 0) return (long)1;
        
        long ans = 0;
        // 1st way, range from i to n ||----------------------------------
        for(int j=i;j<=n+1;j++)
            ans += ways(n - j, j + 1);
        
        // // 2nd way ||--------------------------------------------------
        // while(i <= n){
        //     ans += ways(n - i, i + 1);
        //     i++;
        // }
        return ans;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 1));
    }
}