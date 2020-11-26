package org.javaturk.oopj.ch11.immutable;

/**
 * Functional Person class. 
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 */
public final class Person {
	private final String no;
	private final String name;
	private Address address;
	
	public Person(String no, String name, Address address) {
		this.no = no;
		this.name = name;
		this.address = address;
	}

	public String getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		Address newAddress = new Address(address);
		return newAddress;
	}
}
