package org.javaturk.oopj.ch09.tree;

public class TreeWithThis {

	private String type;
	private float height;
	
	// Can this constructor do its job by calling other constructors?
	public TreeWithThis(String type, float height) {
		System.out.println("\nin TreeWithThis(String, int)");
		this.type = type;
		this.height = height;
		System.out.println(height);
	}
	
	public TreeWithThis(String newType) {
//		type = newType;
//		height = 1.0f;
		this(newType, 1.0f);
		System.out.println("\nin TreeWithThis(String)");
	}
	
	public TreeWithThis(float newHeight) {
//		type = "Pine";
//		height = newHeight;
		this("Pine", newHeight);
		System.out.println("\nin TreeWithThis(int)");
	}
	
	public void printInfo(){
		System.out.println("\nTreeWithThis Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		TreeWithThis tree1 = new TreeWithThis("Pine", 2.0f);
		tree1.printInfo();

		TreeWithThis tree2 = new TreeWithThis("Oak");
		tree2.printInfo();
		
		TreeWithThis tree3 = new TreeWithThis(8.0f);
		tree3.printInfo();
	}
}
