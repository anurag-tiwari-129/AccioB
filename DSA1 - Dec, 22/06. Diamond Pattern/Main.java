// sitaram
// dsa-1: dec, 06/12/2022
import java.util.*;
class Main{
    public static void main(String[] args){
        // Write your code here
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            test--;
            int n = sc.nextInt();
            // 1st way, using 2 loops ||--------------------------------
            for(int i=0;i<n/2+1;i++){
                for(int j=1;j<n/2+1-i;j++)
                    System.out.print("  ");
                for(int j=0;j<2*i+1;j++)
                    System.out.print("* ");
                System.out.println();
            }
            for(int i=0;i<n/2;i++){
                for(int j=0;j<=i;j++)
                    System.out.print("  ");
                for(int j=0;j<2*(n/2-i)-1;j++)
                    System.out.print("* ");
                System.out.println();
            }
            // ---------------------------------------------------------
            
            // 2nd way, using 3 loops ||--------------------------------
            for(int i=0;i<n/2+1;i++){
                for(int j=1;j<n/2+1-i;j++)
                    System.out.print("  "); // space
                for(int j=0;j<=i;j++)
                    System.out.print("* "); // left triangle
                for(int j=0;j<i;j++)
                    System.out.print("* "); // right triangle
                System.out.println();
            }
            for(int i=0;i<n/2;i++){
                for(int j=0;j<=i;j++)
                    System.out.print("  "); // space
                for(int j=0;j<n/2-i;j++)
                    System.out.print("* "); // left triangle
                for(int j=0;j<n/2-i-1;j++)
                    System.out.print("* "); // right triangle
                System.out.println();
            }
        }
    }
}