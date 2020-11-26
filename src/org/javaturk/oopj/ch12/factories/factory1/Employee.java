package org.javaturk.oopj.ch12.factories.factory1;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Employee {
	protected int no;
	protected String name;
	protected int year;
	protected String department;

	public static final int BASE_SALARY = 500;
	
	public Employee(int no, String name, int year, String department) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
		System.out.println("in Employee()");
	}

	public void work() {
		System.out.println("Employee is working!");
	}

	public double calculateSalary(){
		return year * BASE_SALARY;
	}

	public void printInfo() {
		System.out.println("\nNo: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
	}

	public static int getBaseSalary() {
		return BASE_SALARY;
	}
}
