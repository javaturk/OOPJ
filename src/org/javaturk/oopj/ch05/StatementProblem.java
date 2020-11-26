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
public class StatementProblem {

	private int i = 1;

	public static void main(String[] args) {
		// Statement problem
		int i = 2;
//		if (i < 3)
//			 int ii = 3;		
		
		
		if (i < 3)
			 if(i > 0);
		
		if (i < 3)
			 i = i++ - 5;
		
//		if (i < 3)
//			 int k;

		
		for (int j = 0; j < 10; j++)
			System.out.println(j);
		
		// These are all problems!
//		for (int j = 0; j < 10; j++)
//			int k = j;
//		
//		if(true)
//			int u = 7;
//		
//		for (int j = 0; j < 10; j++)
//			int k = j;
//		
//		if(true)
//			int z = 7;
//		
//		do
//			int r = 7;
//		while(true);
	}

//	public static void f(int i) {
//	 if(i == 5)
//		 int k = 8;
//	 }
}
