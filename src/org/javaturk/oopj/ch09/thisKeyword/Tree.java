package org.javaturk.oopj.ch09.thisKeyword;

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

	public Tree(String type, float height) {
		this.type = type;
		this.height = height;
	}

	public Tree copy() {
		Tree copyTree = new Tree(type, height);
		return copyTree;
	}

	public Tree grow() {
		height++;
		return this;
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);	// No need to use this here!
		System.out.println("Height: " + height);	// No need to use this here!
	}

	public static void main(String[] args) {
		Tree tree = new Tree("Pine", 15.0f);
		tree.printInfo();

		Tree copyTree = tree.copy();
		copyTree.printInfo();
		
		System.out.println();
		
		// Check if they point to the same object
		if (tree == copyTree)
			System.out.println("The same");
		else
			System.out.println("Different");

		tree.grow().grow().grow().printInfo();

		Tree grownTree = tree.grow();
		grownTree.printInfo();
		
		System.out.println();
		
		// Check if they point to the same object
		if (tree == grownTree)
			System.out.println("The same");
		else
			System.out.println("Different");
	}
}
