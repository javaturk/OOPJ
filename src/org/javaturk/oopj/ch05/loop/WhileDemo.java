package org.javaturk.oopj.ch05.loop;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class WhileDemo {
    public static void main(String[] args) {
    	
        double r = Math.random();
        System.out.println("r: " + r);
        
        while(r < 0.8) {
            r = Math.random();
            System.out.println("in while: " + r);
        }
        
        System.out.println("After while");
    }
}
