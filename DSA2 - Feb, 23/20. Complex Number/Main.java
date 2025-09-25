// sitaram
// dsa-2: feb, 14/02/2023
public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		//your code here
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(3, 4);

		// value of c2 add in c1 ||-------------------------------------
        // c1.add(c2); // this will not give any result
        System.out.println(c1.add(c2));
		System.out.println();

        // same as above ||---------------------------------------------
		c1.sub(c2); // c2 in c1
		c2.sub(c1); // c1 in c2
		System.out.println();

        // return_type is obj ||----------------------------------------
		Complex c3 = c1.add_return_in_Obj(c2);
		c3.print();
	}
}
class Complex{
	int r;
	int i;

	Complex(int r, int i){
        // r = r, both r are variables
        // "this" differentiate attribute r from variable r
		this.r = r; 
		this.i = i;
	}
	
	String add(Complex c){
        // value of parameter object
		System.out.println(c.r);

        // value of called object
		System.out.println(r);
		System.out.println(this.r);

		String ans = "" + (r + c.r) + " + " + (i + c.i) + 'i';
		return ans;
	}

	void sub(Complex c){
		System.out.println((r - c.r) + " + " + (i - c.i) + 'i');
	}

	void print(){
		System.out.println(r + " + " + i + 'i');
	}

	Complex add_return_in_Obj(Complex c){
		int rr = r + c.r;
		Complex ans = new Complex(rr, this.i + c.i);
        System.out.println("returning answer in object as answer");
		return ans;
	}
}