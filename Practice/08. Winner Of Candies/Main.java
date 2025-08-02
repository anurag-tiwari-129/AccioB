// sitaram
// 02/08/2025
import java.util.*;
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String ans = Solution.winnerOfCandies(x,y);
        System.out.println(ans);
    }
}
class Solution {
    static String winnerOfCandies(int x, int y){
        // write your code here
        
        int count = 1;
        while(true){
            if(count % 2 != 0 && x - count >= 0){
                x = x - count;
                y = y + count;
                count++;
            }
            else if(count % 2 == 0 && y - count >= 0){
                x = x + count;
                y = y - count;
                count++;
            }
            else 
                break;
        }
        if(count % 2 == 0)
            return "Win";
        return "Lose";
    }
}