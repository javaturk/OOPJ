package org.javaturk.oopj.ch09.tree;

public class TreeWithArgumentConstructor {

	private String type;
	private float height;

	public TreeWithArgumentConstructor(String type, float height) {
		this.type = type;
		this.height = height;
		System.out.println("TreeWithArgumentConstructor(String newType, float newHeight)");
	}
	
	public TreeWithArgumentConstructor() {
		type = "Pine";
		height = 1.0f;
		
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public void printInfo(){
		System.out.println("\nTreeWithArgumentConstructor Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		TreeWithArgumentConstructor tree1 = new TreeWithArgumentConstructor("Pine", 2.0f);
		tree1.printInfo();

		TreeWithArgumentConstructor tree2 = new TreeWithArgumentConstructor("Oak", 5.5f);
		tree2.printInfo();
		
		TreeWithArgumentConstructor tree3 = new TreeWithArgumentConstructor();
		tree3.printInfo();
	}
}
