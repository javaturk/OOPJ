package org.javaturk.oopj.ch12.factories.factory2;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		e1.printInfo();
		System.out.println("Maaşı: " + e1.calculateSalary());
		e1.work();

		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		m1.printInfo();
		System.out.println("Maaşı: " + m1.calculateSalary());
		m1.work();
		m1.manage();

		Director d1 = new Director(4, "Mehmet", 2, "Management", "Management", 3000);
		d1.printInfo();
		System.out.println("Maaşı: " + d1.calculateSalary());
		d1.work();
		d1.manage();
		d1.makeStrategicPlan();
	}
}
