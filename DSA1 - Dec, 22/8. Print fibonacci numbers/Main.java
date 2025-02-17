// sitaram
// dsa-1: dec, 06/12/2022
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // Write code here
        
        int a = 0;
        int b = 1;
        int c = a;
        while(n > 0){
            c = c + a;
            System.out.println(c);
            a = b;
            b = c;
            n--;
        }
    }
}