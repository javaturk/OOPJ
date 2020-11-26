package org.javaturk.oopj.ch12.composition;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
class Engine {
	private int volume;
	private int horsePower;
	
	
	public Engine(int volume, int horsePower) {
		this.volume = volume;
		this.horsePower = horsePower;
		System.out.println("A engine is created. Volume is " + volume + " cc and horse power is " + horsePower);
	}
	
	public void start(){
		System.out.println("\nEngine started.");
	}
	
	public void stop(){
		System.out.println("\nEngine stopped.");
	}
}
