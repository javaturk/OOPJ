package org.javaturk.oopj.ch09.statik;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Geometry {

	static final double PI = Math.PI;
	static final Point origin = new Point(0, 0);

	public static void main(String[] args) {
		System.out.println(Geometry.calculateAreaOfCircle(10));
		System.out.println(Geometry.calculateAreaOfARectangle(10, 8));
		System.out.println(Geometry.calculateAreaOfATriangle(5, 9));

		Point p1 = new Point(3, 4);
		Point p2 = new Point(15, 20);
		System.out.println(Geometry.calculateDistanceBetweenTwoPoints(p1, p2));
		
		System.out.println(Geometry.calculateDistanceToOrigin(p1));
		System.out.println(Geometry.calculateDistanceToOrigin(p2));
	}

	public static double calculateAreaOfCircle(double radius) {
		return PI * radius * radius;
	}

	public static double calculateCircumferenceOfCircle(double radius) {
		return 2 * PI * radius;
	}

	public static double calculateAreaOfARectangle(double width, double length) {
		return width * length;
	}

	public static double calculateAreaOfATriangle(double base, double height) {
		return 0.5 * base * height;
	}

	public static double calculateDistanceBetweenTwoPoints(Point p1, Point p2) {
		double distance = Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
		return distance;
	}
	
	public static double calculateDistanceToOrigin(Point p1) {
		return calculateDistanceBetweenTwoPoints(p1, origin);
	}
}
