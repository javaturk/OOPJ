package org.javaturk.oopj.ch13.wrapper;

public class Wrappers {
	public static void main(String[] args) {
		beforeFive();
		afterFive();
	}
	
	public static void beforeFive(){
		int i = 8;
		Integer iObject = new Integer(i);
		System.out.println(iObject);

		int ii = iObject.intValue();
		System.out.println(ii);

		boolean b = false;
		Boolean bObject = new Boolean(b);
		System.out.println(bObject);

		boolean bb = bObject.booleanValue();
		System.out.println(bb);
		
		double d = Math.PI;
		Double dObject = new Double(d);
		System.out.println(dObject);
		
		double dd = dObject.doubleValue();
		System.out.println(dd);
	}
	
	public static void afterFive(){
		int i = 8;
		Integer iObject = i;
		System.out.println(iObject);
		
		String iString = iObject.toString();
//		//iString +=" araba";
//		System.out.println(iString);
		
		int ii = iObject;
		System.out.println(ii);
		
		Integer iObject2 = new Integer("21142374");
		int i2 = iObject2;
		System.out.println(i2);
	
		int i3 = Integer.parseInt("18");
		System.out.println(i3);
//		
//		int iiii = Integer.valueOf(iString).intValue();
//		System.out.println(iiii);

		String s2 = "false";
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(!b);
//		
		String doubleString = "45.697878D";
		double dd = Double.parseDouble(doubleString);
		System.out.println(dd);
		
		int k = 8;
		Integer kObject = k;
		int kk = kObject;
	}
}
