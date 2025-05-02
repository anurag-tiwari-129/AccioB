// sitaram
// dsa-1: jan, 17/01/2023
import java.io.*;
import java.util.*;
public class Main {
	static int isPalindrome(String str){
		// write code here

		str = str.toLowerCase();
		int s = 0, e = str.length() - 1;
		while(s < e){
			if(str.charAt(s) > 'z' || str.charAt(s) < 'a')
				s++;
			else if(str.charAt(e) > 'z' || str.charAt(e) < 'a')
				e--;
			else if(str.charAt(s) != str.charAt(e))
				return 0;
			else{
				s++;
				e--;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int result = isPalindrome(str);
		System.out.println(result);
	}
}