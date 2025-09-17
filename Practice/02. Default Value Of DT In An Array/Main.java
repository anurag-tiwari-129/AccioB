// sitaram
import java.util.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		// your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// default byte values ||---------------------------------------
		byte [] l_byte = {};
		System.out.println(l_byte); // print address
		for(byte i : l_byte)
			System.out.println(i); // print nothing

		byte [] o_byte = new byte[n];
		System.out.println(o_byte); // print address
		for(byte i : o_byte)
			System.out.println(i); // print 0
		// -------------------------------------------------------------

		// default short values ||--------------------------------------
		short [] l_short = {};
		System.out.println(l_short); // print address
		for(short i : l_short)
			System.out.println(i); // print nothing

		short [] o_short = new short[n];
		System.out.println(o_short); // print address
		for(short i : o_short)
			System.out.println(i); // print 0
		// -------------------------------------------------------------

		// default int values ||----------------------------------------
		int [] l_int = {};
		System.out.println(l_int); // print address
		for(int i : l_int)
			System.out.println(i); // print nothing

		int [] o_int = new int[n];
		System.out.println(o_int); // print address
		for(int i : o_int)
			System.out.println(i); // print 0
		// -------------------------------------------------------------

		// default long values ||---------------------------------------
		long [] l_long = {};
		System.out.println(l_long); // print address
		for(long i : l_long)
			System.out.println(i); // print nothing

		long [] o_long = new long[n];
		System.out.println(o_long); // print address
		for(long i : o_long)
			System.out.println(i); // print 0
		// -------------------------------------------------------------

		// default float values ||--------------------------------------
		float [] l_float = {};
		System.out.println(l_float); // print address
		for(float i : l_float)
			System.out.println(i); // print nothing

		float [] o_float = new float[n];
		System.out.println(o_float); // print address
		for(float i : o_float)
			System.out.println(i); // print 0.0
		// -------------------------------------------------------------

		// default double values ||-------------------------------------
		double [] l_double = {};
		System.out.println(l_double); // print address
		for(double i : l_double)
			System.out.println(i); // print nothing

		double [] o_double = new double[n];
		System.out.println(o_double); // print address
		for(double i : o_double)
			System.out.println(i); // print 0.0
		// -------------------------------------------------------------

		// default char values ||---------------------------------------
		char [] l_char = {};
		// Java treats it like a string and directly prints its content as characters concatenated.
		System.out.println(l_char); // print nothing
		for(char i : l_char)
			System.out.println(i); // print nothing

		char [] o_char = new char[n];
		// Java treats it like a string and directly prints its content as characters concatenated.
		// ['\u0000', '\u0000', ...] i.e., null characters
		System.out.println(o_char); // print nothing
		for(char i : o_char)
			System.out.println(i); // print nothing 
			// bcz that is null character which is not visible
		// -------------------------------------------------------------

		// default boolean values ||------------------------------------
		boolean [] l_bool = {};
		System.out.println(l_bool); // print address
		for(boolean i : l_bool)
			System.out.println(i); // print nothing

		boolean [] o_bool = new boolean[n];
		System.out.println(o_bool); // print address
		for(boolean i : o_bool)
			System.out.println(i); // print false
		// -------------------------------------------------------------

		// default string values ||-------------------------------------
		String [] l_String = {};
		System.out.println(l_String); // print address
		for(String i : l_String)
			System.out.println(i); // print nothing

		String [] o_String = new String[n];
		System.out.println(o_String); // print address
		for(String i : o_String)
			System.out.println(i); // print null
		// -------------------------------------------------------------

		// default object values ||-------------------------------------
		Object [] l_Object = {};
		System.out.println(l_Object); // print address
		for(Object i : l_Object)
			System.out.println(i); // print nothing

		Object [] o_Object = new Object[n];
		System.out.println(o_Object); // print address
		for(Object i : o_Object)
			System.out.println(i); // print null
	}
}