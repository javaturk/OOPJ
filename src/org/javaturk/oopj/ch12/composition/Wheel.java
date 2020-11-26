package org.javaturk.oopj.ch12.composition;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
class Wheel {
	private String name;
	
	public Wheel(String name) {
		this.name = name;
		System.out.println("A wheel is created: " + name);
	}
	
	public void rotate(){
		System.out.println("Wheel is rotating.");
	}
}
