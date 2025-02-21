// sitaram
import java.util.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		// your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// default int values ||----------------------------------------
		int [] num = {};
		System.out.println(num); // print address
		for(int i : num)
			System.out.println(i); // print nothing

		int [] num = new int[n];
		System.out.println(num); // print address
		for(int i : num)
			System.out.println(i); // print 0

		// default boolean values ||------------------------------------
		boolean [] bool = {};
		System.out.println(bool); // print address
		for(boolean i : bool)
			System.out.println(i); // print nothing

		boolean [] bool = new boolean[n];
		System.out.println(bool); // print address
		for(boolean i : bool)
			System.out.println(i); // print false

		// default float values ||--------------------------------------
		float [] point = {};
		System.out.println(point); // print address
		for(float i : point)
			System.out.println(i); // print nothing

		float [] point = new float[n];
		System.out.println(point); // print address
		for(float i : point)
			System.out.println(i); // print 0.0

		// default string values ||-------------------------------------
		String [] str = {};
		System.out.println(str); // print address
		for(String i : str)
			System.out.println(i); // print nothing

		String [] str = new String[n];
		System.out.println(str); // print address
		for(String i : str)
			System.out.println(i); // print null

		// default char values ||---------------------------------------
		char [] ch = {};
		System.out.println(ch); // print nothing
		for(char i : ch)
			System.out.println(i); // print nothing

		char [] ch = new char[n];
		System.out.println(ch); // print nothing
		for(char i : ch)
			System.out.println(i); // print nothing
	}
}