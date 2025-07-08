// sitaram
// dsa-2: feb, 07/02/2023
import java.io.*;
import java.util.*;
class Main{
    public static void solve(int n){
        // Your code here

        if(n == 0) return;

        solve(n - 1);
        // // by iteration ||--------------------------------------------
        // for(int i=0;i<n;i++)
        //     System.out.print("* ");
        
        // by recursion ||-----------------------------------------------
        row_star(n);
        System.out.println();
    }
    // by recursion, print the row items ||------------------------------
    static void row_star(int n){
        if(n == 0) return;
        System.out.print("* ");
        row_star(n - 1);
    }
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
}