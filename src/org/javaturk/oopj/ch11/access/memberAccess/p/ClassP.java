package org.javaturk.oopj.ch11.access.memberAccess.p;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class ClassP {
	public int x = 10;
	int y = 20;
	protected int w = 30;
	private int z = 40;

	public void publicMethod() {
		System.out.println(z);
		Class z;
		privateMethod();
	}

	void defaultMethod() {
		privateMethod();
	}

	protected void protectedMethod() {
		privateMethod();
	}

	private void privateMethod() {

	}
}
