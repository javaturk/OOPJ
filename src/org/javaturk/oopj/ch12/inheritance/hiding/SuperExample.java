package org.javaturk.oopj.ch12.inheritance.hiding;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class SuperExample {

	public static void main(String[] args) {
		B b = new B();
		b.printInfo();
	}
}

class A {
	static int i = 7;
	int j = 9;

	static void f() {
		System.out.println("in f() of A");
	}
	
	 void g() {
		System.out.println("in g() of A");
	}
}

class B extends A {
//	static int t = 2 * super.i; // Can't say this!
//	static double t = 2 * i; // Can't do this because it is a forward reference!
	static double t = 2 * A.i;
	static double i = 17d;
	int j = 19;
	int k;
	int l;
	int m = 2 * super.i; // Unethical access: Prefer A.i
	
	static
	{
//		i = 2 * super.j; // Can't use super in a static context!
	}
	
	{
		k = super.j;
	}

	public B() {
		l = 2 * super.j;
	}
	
	static void f() {
		System.out.println("in f() of B");
//		super.f(); // Can't use super in a static context!
//		A.f();	// That's ok.
	}
	
	public void printInfo() {
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("k: " + k);
		System.out.println("l: " + l);
		System.out.println("m: " + m);
		System.out.println("t: " + t);
		System.out.println("super.i: " + super.i);
		
		System.out.println();
		
		f();
		this.f(); // Unethical access: Prefer f()
		A.f(); // Unethical access: Prefer A.f()
		
		System.out.println();
		
		super.f();
		A.f();
		
		System.out.println();
		
		A a = new A();
		a.g();
		super.g();
		
//		receiveParent(super); // Can't do this!
//		receiveParent(this.super); // Can't do this!
	}
	
	void receiveParent(A a){
		System.out.println("in receiveParent()");
	}
	
//	A getParent(){
//		return super; // Can't do this!
//	} 
}