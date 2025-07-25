// sitaram
// dsa-2: feb, 09/02/2023
import java.io.*;
import java.util.*;
public class Main {
    static void printStairPaths(int n,String pathSoFar) {
        // Write your code here

        if(n < 0) return;
        if(n == 0){
            System.out.println(pathSoFar);
            return;
        }

        printStairPaths(n - 1, pathSoFar + 1);
        printStairPaths(n - 2, pathSoFar + 2);
        printStairPaths(n - 3, pathSoFar + 3);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n,"");
    }
}