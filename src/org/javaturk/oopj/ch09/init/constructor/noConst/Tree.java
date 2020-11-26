package org.javaturk.oopj.ch09.init.constructor.noConst;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Tree {
	String type;
	float height;

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.printInfo(); // Not a meaningful state!
		tree.type = "Oak";
		tree.height = 8.74f;
		tree.printInfo(); // Meaningful state!
	}
}
