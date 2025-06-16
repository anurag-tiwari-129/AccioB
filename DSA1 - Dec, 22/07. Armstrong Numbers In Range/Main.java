// sitaram
// 17/02/2025
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=m;i<=n;i++){
            // count no of digits ||------------------------------------
            int tem = i;
            int count = 0;
            while(tem > 0){
                tem /= 10;
                count++;
            }
            // make armstrong by no of digits ||------------------------
            tem = i;
            int ans = 0;
            while(tem > 0){
                ans += Math.pow(tem % 10, count);
                tem /= 10;
            }
            // check armstrong ||---------------------------------------
            if(ans == i)
                System.out.print(i + " ");
        }
    }
}