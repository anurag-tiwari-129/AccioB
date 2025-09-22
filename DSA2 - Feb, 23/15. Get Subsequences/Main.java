// sitaram
// dsa-2 : feb, 13/02/2023
import java.io.*;
import java.util.*;
public class Main {
	public static ArrayList<String> generateSubsequences(String str){
		// write your code here
		
		// // 1st way, in old way ||------------------------------------
		// ArrayList<String> ans = new ArrayList<>();
		// old_way(str,"", ans);

		// 2nd way, in new way ||---------------------------------------
		ArrayList<String> ans = new_way(str);

		Collections.sort(ans);
		ans.remove("");
		return ans;
	}
	// 2nd way, in new way ||-------------------------------------------
	static ArrayList<String> new_way(String str){	
		if(str.length() == 0){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		ArrayList<String> roq = new_way(str.substring(1));
		ArrayList<String> ans = new ArrayList<>();
		for(String s : roq){
			ans.add(str.charAt(0) + s);
			ans.add(s);
		}
		return ans;
	}
	// -----------------------------------------------------------------

	// // 1st way, in old way ||----------------------------------------
	// static void old_way(String q, String a, ArrayList<String> r){
	// 	if(q.length() == 0){
	// 		r.add(a);
	// 		return;
	// 	}

	// 	old_way(q.substring(1), a + q.charAt(0), r);
	// 	old_way(q.substring(1), a, r);
	// }
	// -----------------------------------------------------------------

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
    }
}