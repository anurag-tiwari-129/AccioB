// sitaram
// dsa-1: jan, 20/01/2023
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++)
            array[i]= sc.nextInt();
        insertionSort(array,n);
    }
	 static void insertionSort(int a[], int n){
        // Write your code here

        // 1st way, stable & adaptive ||---------------------------------
        for(int i=1;i<n;i++){
            int j = i;
            while(j > 0 && a[j] < a[j - 1]){
                int tem = a[j];
                a[j] = a[j - 1];
                a[j - 1] = tem;
                j--;
            }
        }
        //---------------------------------------------------------------

        // 2nd way, stable & make-adaptive ||----------------------------
        for(int i=1;i<n;i++){
            boolean swap = true; // for adaptive
            for(int j=i;j>0;j--){
                if(a[j] < a[j - 1]){
                    int tem = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tem;
                    swap = false;
                }
                if(swap) 
                    // if items not get compare in 1st pass, no need to run again
                    break;
            }
        }
        //---------------------------------------------------------------

        for(int i : a)
            System.out.print(i + " ");
    }
}