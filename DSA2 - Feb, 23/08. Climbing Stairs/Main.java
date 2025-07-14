// sitaram
// 14/07/2025
import java.util.*;
import static java.lang.Math.ceil;
class Accio {
    public int ClimbingStairs(int n) {
        // Write your code here

        if(n < 0) return 0;
        if(n == 0) return 1;

        int one = ClimbingStairs(n - 1);
        int two = ClimbingStairs(n - 2);
        return one + two;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.ClimbingStairs(n));
    }
}