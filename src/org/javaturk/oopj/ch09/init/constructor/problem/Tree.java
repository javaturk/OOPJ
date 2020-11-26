package org.javaturk.oopj.ch09.init.constructor.problem;

public class Tree {

	String type;
	float height;

	Tree(String newType, float newHeight) {
//		printInfo();	//! Thats's problem!
		type = newType;
		height = newHeight;
	}

	Tree(String newType) {
//		printInfo();	//! That's problem!
		this(newType, 1.0f);
	}

	Tree(float newHeight) {
		this("Pine", newHeight);
	}

	Tree() {
		this("Pine", 1.0f);
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		Tree tree1 = new Tree("Pine", 2.0f);
		tree1.printInfo();
		
//		Tree tree2 = new Tree("Oak");
//		tree2.printInfo();

//		Tree tree3 = new Tree(8.0f);
//		tree3.printInfo();
//
//		Tree tree4 = new Tree();
//		tree4.printInfo();
	}
}
