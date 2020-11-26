package org.javaturk.oopj.ch09.init.constructor.overloaded;

import java.util.Date;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Employee {

	int id;
	String firstName;
	String lastName;
	Date birthDate;
	float salary;
	String department = "No department yet!";

	public Employee(int newId, String newFirstName, String newLastName, Date newBirthDate, float newSalary) {
		id = newId;
		firstName = newFirstName;
		lastName = newLastName;
		birthDate = newBirthDate;
		salary = newSalary;
	}

	public Employee(int newId, String newFirstName, String newLastName, Date newBirthDate, float newSalary,
			String newDepartment) {
//		id = newId;
//		firstName = newFirstName;
//		lastName = newLastName;
//		birthDate = newBirthDate;
//		salary = newSalary;
		this(newId, newFirstName, newLastName, newBirthDate, newSalary);
//		department = newDepartment;
	}
}