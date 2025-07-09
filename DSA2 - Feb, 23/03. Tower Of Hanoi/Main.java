// sitaram
// dsa-2: feb, 07/02/2023
import java.io.*;
import java.util.*;
class Main {
	static void toh(int n, int source, int auxiliary, int destination) {
		// Write code here

		if(n == 0) return;
        
		// if n = 2, before move 2 from source to destination
		// move 1 from source to auxiliary ||-----------------------------
		toh(n - 1, source, destination, auxiliary);
		// then move 2 from source to destination ||----------------------
		System.out.println("move disk "+ n +" from rod "+ source +" to rod "+ destination);
		// then bring back 1 from auxiliary to destination ||-------------
		toh(n - 1, auxiliary, source, destination);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		toh(N, 1, 2, 3);
		sc.close();
	}
}