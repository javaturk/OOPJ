package org.javaturk.oopj.ch12.factories.factory3;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		e1.printInfo();
		System.out.println("Maaşı: " + e1.calculateSalary());
		e1.work();

		System.out.println();
		
		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		m1.printInfo();
		System.out.println("Maaşı: " + m1.calculateSalary());
		m1.work();
//		m1.manage();
		
		System.out.println();

		Director d1 = new Director(4, "Mehmet", 20, "Management", "Management", 3000);
		d1.printInfo();
		System.out.println("Maaşı: " + d1.calculateSalary());
		d1.work();
//		d1.makeAStrategicPlan();
	}
}
