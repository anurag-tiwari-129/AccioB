// sitaram
// 21/09/2025
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // Write code here

        for(int i=0;i<n;i++){ // if 1 to n
            for(int j=0;j<n;j++){ // & here too 1 to n
                if(j == i || j == (n - 1) - i) // then here be (n + 1) - i
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}