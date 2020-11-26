package org.javaturk.oopj.ch12.factories.factory1;

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
//		Employee e = new Employee(1, "Ali", 14, "Production");
//		e.printInfo();
//		System.out.println("Maaşı: " + e.calculateSalary());
//		e.work();
//
//		System.out.println();
//
//		Manager m = new Manager(2, "Fatma", 3, "Production", "Production");
//		m.printInfo();
//		System.out.println("Maaşı: " + m.calculateSalary());
//		m.work();
//
//		System.out.println();
//
		Director d = new Director(3, "Mehmet", 2, "Management", "Management", 10000);
//		d.printInfo();
//		System.out.println("Maaşı: " + d.calculateSalary());
//		d.work();

//		System.out.println(d);

//		accessStaticMembers(e, m, d);
	}

	public static void accessStaticMembers(Employee e, Manager m, Director d) {
		System.out.println("\nAccessing static members.");
		System.out.println(Employee.BASE_SALARY);
		System.out.println(e.BASE_SALARY);
		System.out.println(Manager.BASE_SALARY);
		System.out.println(m.BASE_SALARY);
		System.out.println(Director.BASE_SALARY);
		System.out.println(d.BASE_SALARY);

		System.out.println(Employee.getBaseSalary());
		System.out.println(Manager.getBaseSalary());
		System.out.println(Director.getBaseSalary());

		System.out.println(e.getBaseSalary());
		System.out.println(m.getBaseSalary());
		System.out.println(d.getBaseSalary());

		System.out.println(Manager.MANAGEMENT_PAYMENT);
		System.out.println(m.MANAGEMENT_PAYMENT);
		System.out.println(Director.MANAGEMENT_PAYMENT);
		System.out.println(d.MANAGEMENT_PAYMENT);
	}
}
