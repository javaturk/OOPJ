package org.javaturk.oopj.ch09.init.initializers.problem;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ForwardReferences {
	
//	int i = j; // Error: Forward reference!
//	int j= 10;
	
//	static int k = l;	// Error: Forward reference!
	static int l = 10;
	
	int i = j;	// Not error, that's ok. Because j is static and initiated before.
	static int j = 10;
	
	static {
		t = 10; // Not error, that's ok.
		u = 8;  // Not error, that's ok.
	}
	static int t, u;
	
	static {
//		v = w; // Error: Forward reference!
	}
	static int v, w;
	
	static {
//		x = y; // Error: Forward reference!
	}
	static {
//		y = x; // Error: Forward reference!
	}
	static int x, y;
	
	int a;
	//int b; // That's ok but a would get 0 in block
	{
//		a = b;	 // Error: Forward reference!
		b = 10;  // Not error, that's ok.
	}
	int b;
}
