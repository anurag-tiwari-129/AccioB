// sitaram
// 22/09/2025
import java.io.*;
import java.util.*;
public class Main {
    public static ArrayList<String> allPossiblePaths(int n, int m) {
        // write code here

        ArrayList<String> ans = new ArrayList<>();
        // // 1st way, old way ||---------------------------------------
        // old(0, 0, n - 1 ,m - 1, "", ans);

        // 2nd way, new way ||------------------------------------------
        ans = new_way(0, 0, n - 1, m - 1);
        return ans;
    }

    // 2nd way, new way ||----------------------------------------------
    static ArrayList<String> new_way(int i, int j, int n, int m){
        if(i == n && j == m){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(i > n || j > m) return new ArrayList<>();
        
        ArrayList<String> ans = new ArrayList<>();
        for(int k=1;k<=2;k++){
            ArrayList<String> d = new_way(i + k, j + k, n, m);
            ArrayList<String> h = new_way(i, j + k, n, m);
            ArrayList<String> v = new_way(i + k, j, n, m);

            for(String s : d) ans.add("d" + k + s);
            for(String s : h) ans.add("h" + k + s);
            for(String s : v) ans.add("v" + k + s);
        }
        return ans;
    }
    // -----------------------------------------------------------------

    // // 1st way, old way ||-------------------------------------------
    // static void old(int i, int j, int n, int m, String r, ArrayList<String> a){
    //     if(i == n && j == m){
    //         a.add(r);
    //         return;
    //     }
    //     if(i > n || j > m) return;

    //     for(int k=1;k<=2;k++){
    //         old(i + k, j + k, n, m, r + "d" + k, a);
    //         old(i, j + k, n, m, r + "h" + k, a);
    //         old(i + k, j, n, m, r + "v" + k, a);
    //     }
    // }
    // -----------------------------------------------------------------

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result)
            System.out.println(str);
    }
}