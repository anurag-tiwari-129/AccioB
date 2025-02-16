// sitaram
// 14/02/2025
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Write your code here and print the required output
        
        int rev = 0, tem = n;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if(rev == tem)
            System.out.println(true);
        else
            System.out.println(false);
    }
}