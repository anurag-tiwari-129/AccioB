// sitaram
// dsa-1: jan, 19/01/2023
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        bubbleSort(N, arr);
        for (int i = 0; i < N; i++) 
            System.out.print(arr[i] + " ");
    }
    public static void bubbleSort(int N, int[] arr) {
        // your code here

        for(int i=0;i<N-1;i++){
            int swap = 0; // check adaptibility
            for(int j=0;j<N-1-i;j++){
                if(arr[j] > arr[j + 1]){
                    swap++;
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
            if(swap == 0) 
                // adaptive, run 1 time only, array is already sorted
                break;
        }
    }
}