// sitaram
// dsa-1: dec, 07/12/2022
import java.util.Scanner;
public class Main {
    public static long binaryToDecimal(long binaryNumber) {
        // write your code here
        
        long mul = 1;
        long ans = 0;
        while(binaryNumber > 0){
            if(binaryNumber % 10 == 1)
                ans = ans + mul;
            mul *= 2;
            binaryNumber /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binaryNumber = scanner.nextInt();
        System.out.println(binaryToDecimal(binaryNumber));
        scanner.close();
    }
}