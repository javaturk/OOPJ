package org.javaturk.oopj.hw.ch02;

public class NamingProblems {
	
	String first_name;
	
	int f(int x, int y) {
		int z = 1;
		for(int i = 0; i < y; i++) {
			z = z * x;
		}
		return z;
	}
	
	public static void main(String[] args) {
		NamingProblems naming_errors = new NamingProblems();
		int base_var = 2;
		int exp_var = 10;
		int base_var_of_pow_exp_var = naming_errors.f(base_var, exp_var);
		System.out.println(base_var + " to the " + exp_var + " is " + base_var_of_pow_exp_var);
		System.out.println(base_var + " ^ " + exp_var + " is " + base_var_of_pow_exp_var);
	
//		int _ = 10;
	}
}
