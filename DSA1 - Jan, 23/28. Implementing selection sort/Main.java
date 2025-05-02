// sitaram
// dsa-1: jan, 19/01/2023
import java.util.*;
public class Main {
    public static int[] SelectionSort(int[] arr) {
        // Write your code here

        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int ind = i;
            for(int j=i+1;j<n;j++)
                if(arr[ind] > arr[j])
                    ind = j;

            if(arr[i] != arr[ind]){
                int tem = arr[ind];
                arr[ind] = arr[i];
                arr[i] = tem;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);
        for(int a : ans)
            System.out.print(a + " ");
    }
}