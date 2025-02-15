// sitaram
// 14/02/2025

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // your code here

        int rem = Math.min(a, b);
        int quo = Math.max(a, b);
        int ans = 0;
        while(rem > 0){
            ans = rem;
            rem = quo % rem;
            quo = ans;
        }
        System.out.print(ans);
    }
}