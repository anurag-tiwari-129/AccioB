// sitaram
// dsa-1: dec, 08/12/2022
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        buildings(arr, n);
    }
    public static void buildings(int[] arr, int n) {
        // your code here

        int max = 0;
        for(int i=0;i<n;i++)
            max = Math.max(max, arr[i]);
        // compare max with the value to print ||------------------------
        for(int i=max;i>0;i--){
            for(int j=0;j<n;j++){
                if(arr[j] >= i)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}