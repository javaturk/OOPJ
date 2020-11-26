package org.javaturk.oopj.ch08.passing;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ParameterPassing {

	public void f(A aa) { // aa = a
		aa.i++;
	}

	public void f(int j) {  // j = i
		j++;
	}

	public static void main(String[] args) {
		ParameterPassing o = new ParameterPassing();
		
//		Passing a primitive
		int i = 5;
		System.out.println("i: " + i);
		o.f(i);
		System.out.println("i: " + i);
		
		System.out.println();
		
//		Passing a reference
		A a = new A();
		System.out.println("a.i: " + a.i);
		o.f(a);
		System.out.println("a.i: " + a.i);
	}
}

class A {
	int i = 5;
}
