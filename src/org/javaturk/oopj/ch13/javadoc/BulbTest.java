
package org.javaturk.oopj.ch13.javadoc;

/**
 * This class is the test class of the class {@link Bulb}.
 * 
 * @see Bulb 
 * @author akin
 */
public class BulbTest {
    /**
     * Main method to create {@link Bulb} object and plays with it.
     *
     * @see Bulb
     * @param args[] Standard array of String arguments.
     */
    public static void main(String args[]) throws IllegalArgumentException, BulbBlownException {
        Bulb bulb = new Bulb();
        bulb.setMaxLuminescence(100);
        int lum = bulb.getMaxLuminescence();
        System.out.println(lum);
        System.out.println(bulb.getMaxLuminescence());

        Bulb bulb100 = new Bulb(100);
        Bulb bulb80 = new Bulb(80);

        bulb100.brighten(80);
        bulb80.brighten(40);
        bulb100.brighten(40);
        bulb80.brighten();
        bulb100.dim(40);
        bulb80.dim();
        bulb100.dim(60);
        bulb100.brighten(120);
        bulb100.dim(40);
    }
    
}
