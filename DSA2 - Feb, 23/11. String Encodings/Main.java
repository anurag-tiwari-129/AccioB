// sitaram
// dsa-2: feb, 10/02/2023
import java.util.*;
public class Main {
    public static void printEncodings(String str) {
        // Write your code here
        
        funct(str, "");
    }
    public static void funct(String ques, String ans){
        // for '0' || '01', no result ||----------------------------------
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        
        // for 1 digit ||-------------------------------------------------
        if(ques.charAt(0) == '0') return;
        int n = ques.charAt(0) - '0';
        char c = (char)('a' + n - 1);
        funct(ques.substring(1), ans + c);
        
        // for 2 digit, <= 26 ||------------------------------------------
        if(ques.length() >= 2){
            int nn = Integer.parseInt(ques.substring(0, 2));
            if(nn <= 26){
                char cc = (char)('a' + nn - 1);
                funct(ques.substring(2), ans + cc);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }
}