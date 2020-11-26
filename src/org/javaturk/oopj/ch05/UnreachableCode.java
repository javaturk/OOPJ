package org.javaturk.oopj.ch05;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */
public class UnreachableCode {

	public static void main(String[] args) {
	

//		// Not an unreachable code :)
		int a = 8;
		int k;
		if (a < 11)
			k = 7;
		else
			k = 9;
//
//		System.out.println(k);
//
//		while (true){
//			System.out.println("Selam");
//			if(k > 5)
//				break;
		}
//		int i = 5; // Unreachable code!
//
//		while (false)
//			System.out.println("Selam"); // Unreachable code!
//		int r = 5;
//
////		k = 2;
//		// Unreachable code if break does not exist.
//		while (true) {
//			System.out.println("Selam");
//			k++;
//			if(k > 5)
//				break;
//		}
//		int ii = 5; // Unreachable code without break.
//
//
////		That's not unreachable code
//		if (false) {
//			System.out.println("Selam");
//		}
//
//		for (int m = 0; false; m++){
//			System.out.println(m);
//			break;
//		}
//		System.out.println("Break!"); // Unreachable code without a break
//
//		for (;;) {
//			System.out.println("Selam");
////			break;
//			System.out.println("Bir selam daha."); // Unreachable code due to break
//		}
//
////		for (;;) {
////			System.out.println("Selam");
////			if (true)
////				break;
////			System.out.println("Bir selam daha.");   // Dead code not unreachable code
////		}
//
////		 try {
////		
////		 } catch (IOException e) { // Unreachable code. Try to catch Exception
////		 // or RuntimeException and see what happens
////		
////		 }
//
//		// return;
//		// System.out.println("Son after return"); // Unreachable code!
//	}
//
//	public int f() {
//		if (false) {
//			System.out.println("In if");
//			return 8;
//		} else {
//			System.out.println("in Else");
//			return 0;
//		}
		// System.out.println("Son"); // Unreachable code!
//	}
}
