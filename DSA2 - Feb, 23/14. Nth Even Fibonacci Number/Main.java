// sitaram
// 20/09/2025
import java.util.*;
import static java.lang.Math.ceil;
public class Main {
    static long NthEvenFibonacci(long n) {
        // Write your code here
        
        return funct(0, 1, n);
    }
    static long funct(long a, long b, long n){
        // return in modulo acc to ques
        if(n == 0) return b % 1000000007;
        
        long c = a + b;
        a = b;
        b = c;
        if(c % 2 == 0)
            return funct(a, b, --n);
        return funct(a, b, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
    }
}