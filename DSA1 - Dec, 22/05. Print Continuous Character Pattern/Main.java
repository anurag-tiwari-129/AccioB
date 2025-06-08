// sitaram
// dsa-1: dec, 06/12/2022, 07/12/2022
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // write code here
        
        for(int i=0;i<n;i++){
            // ch = 'A' + 0 = 'A';
            // ch = 'A' + 13 = 'N';
            char ch = (char)('A' + i);
            for(int j=0;j<=i;j++){
                // ans = ('A' + 0 - 'A') % 26 + 'A' = 'A';
                // ans = ('N' + 0 - 'A') % 26 + 'A' = 'N';
                // ans = ('N' + 13 - 'A') % 26 + 'A' = 'A';
                char ans = (char)((ch + j - 'A') % 26 + 'A');
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}