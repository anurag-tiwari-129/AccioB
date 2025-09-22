// sitaram
// dsa-2 : feb, 13/02/2023
import java.util.*;
class Main {
	static ArrayList <String> OldPhone(int n, int[] keys){
		// Write your code here

		String ref[] = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TU", "VWX", "YZ"};
		// // 1st way, old way ||---------------------------------------
		// ArrayList<String> ans = new ArrayList<>();
		// old(0, keys, "", ref, ans);
		
		// 2nd way, new way ||------------------------------------------
		ArrayList<String> ans = new_way(0, keys, ref);
		return ans;
	}

	// 2nd way, new way ||----------------------------------------------
	static ArrayList<String> new_way(int i, int[] k, String[] r){
		if(i == k.length){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> roq = new_way(i + 1, k ,r);
		String s = r[k[i]];
		for(int j=0;j<s.length();j++){
			for(String str : roq){
				ans.add(s.charAt(j) + str);
			}
		}
		return ans;
	}
	// -----------------------------------------------------------------

	// // 1st way, old way ||-------------------------------------------
	// static void old(int i, int[] k, String r, String[] ref, ArrayList<String> a){
	// 	if(i == k.length){
	// 		a.add(r);
	// 		return;
	// 	}

	// 	String s = ref[k[i]];
	// 	for(int j=0;j<s.length();j++)
	// 		old(i + 1, k, r + s.charAt(j), ref, a);
	// }
	// -----------------------------------------------------------------

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] keys = new int[n];
		for(int i=0;i<n;++i)
			keys[i] = sc.nextInt();
		ArrayList <String> ans = OldPhone(n, keys);
		for(String i : ans)
			System.out.print(i + " ");
	}
}