/*
 * PrimitiveOverloading.java
 */

package org.javaturk.oopj.ch08.overloading;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class PrimitiveOverloading1 {
	// Comment out the following lines one by one
	static void f1(byte x) { prt("f1(byte)"); }
    static void f1(short x) { prt("f1(short)"); }
    static void f1(char x) { prt("f1(char)"); }
    static void f1(int x) { prt("f1(int)"); }
    static void f1(long x) { prt("f1(long)"); }
    static void f1(float x) { prt("f1(float)"); }
    static void f1(double x) { prt("f1(double)"); }
    
    static void prt(String s) {
        System.out.println(s);
    }
    
    public static void main(String[] args){
        byte b = 3;         f1(b);
        short s = 4;        f1(s);
        char c = 'a';       f1(c);
        int i = 5;          f1(i);
        long l = 5l;        f1(l);
        float f = 5.0f;     f1(f);
        double d = 6.0d;    f1(d);
    }
}
