// sitaram
// 01/05/2025
import java.util.*;
public class Main {
    static void oddEvenSort(int a[], int n){
        // Write your code here
        
        boolean not_Sorted = true;
        // run until the array get sorted ||----------------------------
        while (not_Sorted){
            not_Sorted = false;

            // sort odd index with adjacent value ||--------------------
            for (int i=1; i<=n-2; i=i+2)
                if (a[i] > a[i + 1]){
                    int tem = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tem;
                    not_Sorted = true;
                }

            // sort even index with adjacent value ||-------------------
            for (int i=0; i<=n-2; i=i+2)
                if (a[i] > a[i + 1]){
                    int tem = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tem;
                    not_Sorted = true;
                }
        }
        for(int j=0;j<n;j++)
            System.out.print(a[j] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
            array[i]= sc.nextInt();
        oddEvenSort(array,n);
    }
}