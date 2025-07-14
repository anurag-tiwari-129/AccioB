// sitaram
// dsa-2: feb, 09/02/2023
import java.io.*;
import java.util.*;
public class Main {
    static void printKPC(String ques) {
        // Write your code here

        String [] ref = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        print(ques, "", ref);
    }
    static void print(String q, String a, String [] r){
        if(q.length() == 0){
            System.out.println(a);
            return;
        }
        
        char num = q.charAt(0);
        String word = r[num - '0'];
        for(int i=0;i<word.length();i++)
            print(q.substring(1), a + word.charAt(i), r);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printKPC(str);
    }
}