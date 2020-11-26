package org.javaturk.oopj.ch09.init.initializers;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class InitialValues {
	// Instance variables
    boolean t;	// false
    char c;		// 0
    byte b;		// 0
    short s;		// 0
    int i;		// 0
    long l;		// 0L
    float f;		// 0.0F
    double d;	// 0.0D
    String str;	// null
    
    // Class variables
    static int si;
    static char sc;
    static String sstr;
    
    void print() {
        System.out.println(
        "Data type      Initial values for instance variables\n" +
        "boolean        " + t + "\n" +
        "char           [" + c + "] "+ (int)c +"\n"+
        "byte           " + b + "\n" +
        "short          " + s + "\n" +
        "int            " + i + "\n" +
        "long           " + l + "\n" +
        "float          " + f + "\n" +
        "double         " + d + "\n" +
        "String         " + str + "\n" +
        "\nData type      Initial values for class variables\n" +
        "char           [" + sc + "] "+ (int)sc +"\n"+
        "int            " + si + "\n" +
        "String         " + sstr);
    }
    
    public static void main(String[] args) {
    	
//    		int i;
//    		int k = i;
//    		System.out.println(i);
		
		InitialValues nesne = new InitialValues();
//		System.out.println(nesne.l);
		nesne.print();
	}
}
