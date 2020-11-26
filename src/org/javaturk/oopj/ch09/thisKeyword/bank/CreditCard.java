package org.javaturk.oopj.ch09.thisKeyword.bank;

public class CreditCard {
	String no;
	double balance;
	
	Customer owner;

	public CreditCard(String no, double balance) {
		this.no = no;
		this.balance = balance;
	}
	
	public CreditCard(String no, double balance, Customer owner) {
		this.no = no;
		this.balance = balance;
		this.owner = owner;
//		owner.setCc(this);
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public Customer getOwner() {
		return owner;
	}
}
