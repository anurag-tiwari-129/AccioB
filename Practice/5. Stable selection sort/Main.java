// sitaram
import java.util.*;
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);
        for(int a : ans)
            System.out.print(a + " ");
	}
	public static int[] SelectionSort(int[] arr) {
        // Write your code here

        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int ind = i;
            for(int j=i+1;j<n;j++)
                if(arr[ind] > arr[j])
                    ind = j;

            // here item would shift to right place, will no  direct swap
            // so that, it makes code stable i.e., stable sort
			for(int k=ind;k>i;k--)
				if(arr[k] < arr[k - 1]){
					int tem = arr[k];
                	arr[k] = arr[k - 1];
                	arr[k - 1] = tem;
				}
        }
        return arr;
    }
}