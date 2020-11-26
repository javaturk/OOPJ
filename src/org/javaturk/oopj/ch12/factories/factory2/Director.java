package org.javaturk.oopj.ch12.factories.factory2;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Director extends Manager {

	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
	}
	
	public void makeStrategicPlan(){
		System.out.println("Director makes a strategic plan for the company!");
	}
}
