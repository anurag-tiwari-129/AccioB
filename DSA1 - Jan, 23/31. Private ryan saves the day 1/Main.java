// sitaram
// dsa-1: dec, 25/12/2022
import java.util.*;
class Solution{
    public static int maxFrequency(String str) {
        // Write your code here

        int count = 0, max = 1;
        int n = str.length();
        int s = 1, e = n - 1;
        while(s <= e){
            count = 0;
            String sbf = str.substring(0, s);
            String sbl = str.substring(e);
            if(sbf.equals(sbl)){
                for(int i=0;(i+sbf.length())<=n;i++){
                    String tem = str.substring(i, i + sbf.length());
                    if(tem.equals(sbf))
                        count++;
                }
                max = Math.max(max, count);
            }
            s++;
            e--;
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        Solution Obj = new Solution();
        System.out.println(Obj.maxFrequency(str));
    }
}