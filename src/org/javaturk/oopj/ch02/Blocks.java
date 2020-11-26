package org.javaturk.oopj.ch02;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class Blocks {
	
	long l;
	
	{
		
	}
	
	// Declaration block
	{
		boolean b;
	}

	// Initialization block
	{
//		b = true;
		l = 17L;
	}

	// Definition block
	{
		int i = 6;
	}

	// Method block
	public static void main(String[] args) {
		Blocks bd = new Blocks();
		System.out.println(bd.l);
		
		{
			int t = 5;
			System.out.println(t);
		}

		bd.f();
	} 
	
	// Inner class block
	class InnerClass{}
	
	// Method block
	public void f(){
		// Local class block
		new Blocks(){
			public void sop() {
				System.out.println(l);
			}
		};
	}
}
