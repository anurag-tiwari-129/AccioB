// sitaram
// dsa-2: feb, 09/02/2023
import java.util.*;
import java.util.Scanner;
public class Main{
    static void printSubsequence(String s) {
        // Write your code here

        print(s, ""); // 1st way ||-----------------------------------
        print(s, "", 0); // 2nd way ||------------------------------
    }
    // 1st way ||---------------------------------------------------------
    static void print(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        print(ques.substring(1), ans + ques.charAt(0));
        print(ques.substring(1), ans);
    }
    // -------------------------------------------------------------------
    
    // 2nd way ||---------------------------------------------------------
    static void print(String ques, String ans, int i){
        if(i == ques.length()){
            System.out.print(ans + " ");
            return;
        }
        print(ques, ans + ques.charAt(i), i + 1);
        print(ques, ans, i + 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}