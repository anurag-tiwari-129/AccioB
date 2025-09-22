// sitaram
// dsa-2 : feb, 13/02/2023
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> paths = getStairPaths(n);
		System.out.println(paths);
	}
	public static ArrayList<String> getStairPaths(int n) {
		// your code here

		ArrayList<String> ans = new ArrayList<>();
		// // 1st way, old way ||---------------------------------------
		// old(n, "", ans);

		// 2nd way, new way ||------------------------------------------
		if(n == 0){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		if(n < 0){
			// return new ArrayList<>();
			ArrayList<String> base = new ArrayList<>();
			return base;
		}

		ArrayList<String> one = getStairPaths(n - 1);
		ArrayList<String> two = getStairPaths(n - 2);
		ArrayList<String> tee = getStairPaths(n - 3);
		
		for(String s : one) ans.add(1 + s);
		for(String s : two) ans.add(2 + s);
		for(String s : tee) ans.add(3 + s);
		return ans;
	}
	// -----------------------------------------------------------------

	// // 1st way, old way ||-------------------------------------------
	// static void old(int n, String r, ArrayList<String> a){
	// 	if(n == 0){
	// 		a.add(r);
	// 		return;
	// 	}
	// 	if(n < 0) return;

	// 	old(n - 1, r + 1, a);
	// 	old(n - 2, r + 2, a);
	// 	old(n - 3, r + 3, a);
	// }
	//------------------------------------------------------------------
}