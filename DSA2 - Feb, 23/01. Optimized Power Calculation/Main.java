// sitaram
// dsa-2: feb, 07/02/2023
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(power(X, N));
    }
    public static long power(int x, int y){
        // Write code here

        if(y == 0) return 1;
        
        // (2 ^ 8), then (2 ^ 4) ||--------------------------------------
        long ans = power(x, (y / 2));
        
        // power is even, 2 ^ 8 == (2 ^ 4) * (2 ^ 4) ||------------------
        if(y % 2 == 0) return ans * ans;
        // power is odd, 2 ^ 9 == (2 ^ 4) * (2 ^ 4) * 2 ||---------------
        return ans * ans * x;    
    }
}