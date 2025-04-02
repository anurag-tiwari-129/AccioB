// sitaram
// dsa-1: jan, 18/01/2023
import java.util.*;
public class Main {
    static void ptice(int n, String key) {
        // Write your code here and print output in this function
    
		String adrian = "ABC";
		String bruno = "BABC";
		String goran = "CCAABB";
		int no_a = 0, no_b = 0, no_g = 0;

		for(int i=0;i<n;i++){
			if(key.charAt(i) == adrian.charAt(i % adrian.length()))
				no_a++;
			if(key.charAt(i) == bruno.charAt(i % bruno.length()))
				no_b++;
			if(key.charAt(i) == goran.charAt(i % goran.length()))
				no_g++;
		}
        
		int max = Math.max(no_a, Math.max(no_b, no_g));
		System.out.println(max);
		if(max == no_a)
			System.out.println("Adrian");
		if(max == no_b)
			System.out.println("Bruno");
		if(max == no_g)
			System.out.println("Goran");
	}  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        ptice(n, str);
        sc.close();
    }
}