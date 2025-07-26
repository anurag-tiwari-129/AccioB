// sitaram
// dsa-2: feb, 10/02/2023
import java.util.*;
class Accio {
    public void printPermutations(String str) {
        // Write your code here

        ArrayList<String> arr = new ArrayList<>();
        funct(str, "", arr);
        Collections.sort(arr);
        for(String s : arr)
            System.out.println(s);
    }
    public static void funct(String s, String a, ArrayList<String> arr){
        if(s.length() == 0 && check(a, arr)){
            arr.add(a);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            funct(left + right, a + c, arr);
        }
    }
    static boolean check(String s, ArrayList<String> arr){
        if(arr.contains(s)) return false;
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Accio Obj = new Accio();
        Obj.printPermutations(str);
    }
}