package org.javaturk.oopj.ch09.init.constructor.argConst;

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
	
	public Tree(String newType, float newHeight) {
		type = newType;
		height = newHeight;
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		Tree tree1 = new Tree("Pine", 2.0f);
		tree1.printInfo();

		Tree tree2 = new Tree("Oak", 5.5f);
		tree2.printInfo();
		
//		Tree tree3 = new Tree();
	}
}
