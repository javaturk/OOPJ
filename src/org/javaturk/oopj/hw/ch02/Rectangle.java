package org.javaturk.oopj.hw.ch02;

public class Rectangle {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
//		rectangle.drawFilledRectangleFake1();
//		rectangle.drawFilledRectangleFake2(10);
//		rectangle.drawFilledRectangle(10, 5);
		
//		rectangle.drawVoidRectangleFake1();
		rectangle.drawVoidRectangle(10, 5);
	}

	public void drawFilledRectangle(int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
				if(j == column -1)
					System.out.println();
			}
		}
	}
	
	public void drawVoidRectangle(int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i == 0 | i == row -1) {
					System.out.print("*");
					if(j == column - 1)
						System.out.println();
				}
				else {
					if(j == 0)
						System.out.print("*");
					else if(j == column - 1)
						System.out.println("*");
					else
						System.out.print(" ");
				}
			}
		}
	}

	public void drawVoidRectangleFake1() {
		System.out.println("*****");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*****");
	}
	
	public void drawFilledRectangleFake1() {
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
	}

	public void drawFilledRectangleFake2(int row) {
		for (int i = 0; i < row; i++)
			System.out.println("*****");
	}

}
