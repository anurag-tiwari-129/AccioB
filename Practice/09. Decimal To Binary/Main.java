// sitaram
// 14/08/2025
import java.util.*;
import java.io.*;
class Main{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		Solution obj = new Solution();
		obj.toBinary(N);
		System.out.println();
	}
}
class Solution{
	void toBinary(int N) {
		// Write your code here
		
		StringBuilder sb = new StringBuilder();
		while(N > 0){
			sb.insert(0, N % 2);
			N = N / 2;
		}
		System.out.println(sb);
	}
}