package org.javaturk.oopj.ch09.init.constructor.thisCall;

public class Tree {

	String type;
	float height;

	public Tree(String newType, float newHeight) {
		type = newType;
		height = newHeight;
		System.out.println("Tree(String newType, float newHeight)");
	}

	Tree(String newType) {
		this(newType, 1.0f);
	}

	Tree(float newHeight) {
//		System.out.println("*** Height: " + height);
		this("Pine", newHeight);
		System.out.println("*** Height: " + height);
	}

	Tree() {
		this("Pine", 1.0f);
		System.out.println("in Tree()");
	}

	public void printInfo() {
		
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		Tree tree1 = new Tree("Pine", 2.0f);
		tree1.printInfo();

		Tree tree2 = new Tree("Oak");
		tree2.printInfo();

		Tree tree3 = new Tree(8.0f);
		tree3.printInfo();

		Tree tree4 = new Tree();
		tree4.printInfo();
	}
}
