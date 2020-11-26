package org.javaturk.oopj.ch09.thisKeyword.bank;

public class BankTest {

	public static void main(String[] args) {

		Customer c1 = new Customer(1, "Ahmet");
//		CreditCard cc1 = new CreditCard("1111111111111111", 1000.0);
//		cc1.setOwner(c1);
//		c1.setCc(cc1);
		
		// Alternatively
		Customer c2 = new Customer(2, "Kemal");
		CreditCard cc2 = new CreditCard("2222222222222222", 2500.0, c2);
		
		System.out.println(cc2.getOwner().name);
//		System.out.println(c2.getCc().no);
		
		CreditCard cc3 = c2.getCc();
		if(cc3 == null)
			System.out.println("NULLLLLL");
		
		
	}

}
