package org.javaturk.oopj.ch02;

/**
 * Test class of Selam. It first creates an object of Selam class and 
 * then asks to say "selam" to the name it provides.
 *
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */

public class SelamTest {

	public static void main(String[] args) {
		Selam nesne = new Selam();
		
		String cevap = nesne.selamSoyle("Mehmet");
		System.out.println(cevap);
		
		cevap = nesne.selamSoyle("");
		System.out.println(cevap);
	}
}


