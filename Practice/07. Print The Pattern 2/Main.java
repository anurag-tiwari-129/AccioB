// sitaram
// 09/07/2025
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// Write your code here

		for(int i=1;i<=n;i++){
			// left triangle ||-------------------------------------------
			for(int j=1;j<=n;j++){
				if(j <= i)
					System.out.print(j + "\t");
				else
					System.out.print("\t");
			}
			// right triangle ||------------------------------------------
			for(int j=n-1;j>=1;j--){
				if(j <= i)
					System.out.print(j + "\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}