package org.javaturk.oopj.ch09.tree;

public class TreeWithOverloadedConstructors {
	private String type;
	private float height;

	public TreeWithOverloadedConstructors(String newType, float newHeight) {
//		System.out.println("in TreeWithOverloadedConstructors(String, float)");
		type = newType;
		height = newHeight;
		System.out.println("TreeWithOverloadedConstructors(String newType, float newHeight)");
	}

	public TreeWithOverloadedConstructors(String newType) {
//		type = newType;
//		height = 1.0f;
		this(newType, 1.0f);
	}

	public TreeWithOverloadedConstructors(float newHeight) {
//		type = "Pine";
//		height = newHeight;
		this("Pine", newHeight);
	}

	public TreeWithOverloadedConstructors() {
//		type = "Pine";
//		height = 1.0f;
		this("Pine", 1.0f);
	}

	public void printInfo() {
		System.out.println("\nTreeWithOverloadedConstructor Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		TreeWithOverloadedConstructors tree1 = new TreeWithOverloadedConstructors("Pine", 2.0f);
		tree1.printInfo();

		TreeWithOverloadedConstructors tree2 = new TreeWithOverloadedConstructors("Oak");
		tree2.printInfo();

		TreeWithOverloadedConstructors tree3 = new TreeWithOverloadedConstructors(8.0f);
		tree3.printInfo();
		
		TreeWithOverloadedConstructors tree4 = new TreeWithOverloadedConstructors();
		tree4.printInfo();
	}

}
