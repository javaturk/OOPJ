 package org.javaturk.oopj.ch09.tree;

public class TreeWithDefaultConstructor {
	private String type;
	private float height;
	
	public TreeWithDefaultConstructor(){
		type = "Pine";
		height = 1.0f;
	}
	
	public void printInfo(){
		System.out.println("\nTreeDefaultConstructor Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		TreeWithDefaultConstructor tree1 = new TreeWithDefaultConstructor();
//		tree1.type = "Oak";
//		tree1.height = 2;
		tree1.printInfo();
		
		TreeWithDefaultConstructor tree2 = new TreeWithDefaultConstructor();
		tree2.printInfo();
	}
}
