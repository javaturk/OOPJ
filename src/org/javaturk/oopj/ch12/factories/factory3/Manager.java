package org.javaturk.oopj.ch12.factories.factory3;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Manager extends Employee{
	
	protected String departmentManaged;
	
	public static final int MANAGEMENT_PAYMENT = 6000;
	
	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged){
		super(no, name, year, workingDepartment);
		this.departmentManaged = departmentManaged;
	}
	
	@Override
	public void work(){
		System.out.println("Manager is working!");
		manage();
	}
	
//	@Override
//	public void work(int hour){
//		super.work(hour);
//		manage();
//	}
	
	public void manage(){
		System.out.println("Manager manages department: " + departmentManaged);
	}
	
	@Override
	public double calculateSalary(){
		return year * BASE_SALARY + MANAGEMENT_PAYMENT;
	}
	
	@Override
	public void printInfo(){
		System.out.println("\nNo: " + no);
		System.out.println("Name:" + name);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);
		System.out.println("Managing Department: " + departmentManaged);
	}
}
