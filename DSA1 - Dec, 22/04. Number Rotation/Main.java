// sitaram
// dsa-1: dec, 06/12/2022
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        // count digits ||-----------------------------------------------
        int count = 0, tem = n;
        while(tem > 0){
            tem /= 10;
            count++;
        }
        // find minimum rotations ||-------------------------------------
        k = k % count;
        if(k < 0)
            k = k + count;

        // separate first & last ||--------------------------------------
        int ri_dig = 1;
        for(int i=1;i<=k;i++)
            ri_dig *= 10;
        int first = n % ri_dig;
        int last = n / ri_dig;

        // adjust place of first acc. to last num ||---------------------
        int le_dig = 1;
        for(int i=1;i<=count-k;i++)
            le_dig *= 10;
        first *= le_dig;

        // rotations done
        System.out.println(first + last);
    }
}