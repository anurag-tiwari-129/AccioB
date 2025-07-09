// sitaram
// 09/07/2025
import java.util.Scanner;
public class Main {
	static void towersOfHanoi(int n, char source, char dest) {

		if(n == 0) return;
		char aux = (char)('A' + 'B' + 'C' - source - dest);

		// if n = 2, before move 2 from source to dest 
		// move 1 from source to aux ||-----------------------------------
		towersOfHanoi(n - 1, source, aux);
		// then move 2 from source to dest ||-----------------------------
		System.out.println("Moving ring "+ n +" from "+ source +" to "+ dest);
		// then bring back 1 from aux to dest ||--------------------------
		towersOfHanoi(n - 1, aux, dest);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towersOfHanoi(n, 'A', 'B'); // move n disks from A to B
	}
}