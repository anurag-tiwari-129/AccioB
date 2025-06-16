// sitaram
// 07/05/2025
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		// Your code here
		
		// 1st way, by removing that digit ||---------------------------
		String [] arr = s.split(" ");
		String [] ans = new String[arr.length];
		
		// putting string to given index according to its num ||--------
		for(int i=0;i<arr.length;i++){
			int n = arr[i].charAt(arr[i].length() - 1) - '0';
			ans[n - 1] = arr[i].substring(0, arr[i].length() - 1);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ans.length;i++)
			sb.append(ans[i] + " ");
		System.out.print(sb);
		//--------------------------------------------------------------
		
		// 2nd way, by ignoring that digit ||---------------------------
		// reverse & sort it ||-----------------------------------------
		StringBuilder sb = new StringBuilder(s);
		s = sb.reverse().toString();
		String str[] = s.split(" ");
		Arrays.sort(str);
		
		// ignore digits & print in real form ||------------------------
		for(int i=0;i<str.length;i++)
			if(str[i].length() > 0){
				StringBuilder tem = new StringBuilder(str[i]);
				str[i] = tem.reverse().toString();
				System.out.print(str[i].substring(0, str[i].length() - 1) + " ");
			}
	}
}