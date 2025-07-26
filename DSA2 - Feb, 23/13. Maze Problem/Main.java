// sitaram
// dsa-2: feb, 10/02/2023
import java.io.*;
import java.util.*;
public class Main {
	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        // Write your code here

		if(sr == dr && sc == dc){
			System.out.println(psf);
			return;
		}
        // can skip bcz of for conditions
		if(sr > dr || sc > dc) return;

		// move horizontal ||---------------------------------------------
		for(int i=1;i<=dc-sc;i++)
			printMazePaths(sr, sc + i, dr, dc, psf + 'h' + i);
		// move vertical ||-----------------------------------------------
		for(int i=1;i<=dr-sr;i++)
			printMazePaths(sr + i, sc, dr, dc, psf + 'v' + i);
		// move diagonal ||-----------------------------------------------
		for(int i=1;i<=Math.min(dc-sc, dr-sr);i++)
			printMazePaths(sr + i, sc + i, dr, dc, psf + 'd' + i);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}