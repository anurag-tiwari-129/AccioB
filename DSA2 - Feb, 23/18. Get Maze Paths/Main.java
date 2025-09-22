// sitaram
// dsa-2 : feb, 13/02/2023
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
		System.out.println(paths);
	}
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		// your code here

		ArrayList<String> ans = new ArrayList<>();
		// // 1st way, old way ||---------------------------------------
		// old(sr, sc, dr, dc, "", ans);

		// 2nd way, new way ||------------------------------------------
		if(sr == dr && sc == dc){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		if(sr > dr || sc > dc) return new ArrayList<>();

		ArrayList<String> h = getMazePaths(sr, sc + 1, dr, dc);
		ArrayList<String> v = getMazePaths(sr + 1, sc, dr, dc);

		for(String s : h) ans.add("h" + s);
		for(String s : v) ans.add("v" + s);
		return ans;
	}
	// -----------------------------------------------------------------

	// // 1st way, old way ||-------------------------------------------
	// static void old(int sr, int sc, int dr, int dc, String r, ArrayList<String> a){
	// 	if(sr == dr && sc == dc){
	// 		a.add(r);
	// 		return;
	// 	}
	// 	if(sr > dr || sc > dc) return;

	// 	old(sr, sc + 1, dr, dc, r + "h", a);
	// 	old(sr + 1, sc, dr, dc, r + "v", a);
	// }
	// -----------------------------------------------------------------
}    