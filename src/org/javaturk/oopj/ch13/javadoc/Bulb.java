package org.javaturk.oopj.ch13.javadoc;

/**
 * A <code>Bulb</code> is a bulb. This class simulates a bulb. It has a default
 * constructor that creates a bulb with a max luminescence of 60 and another
 * constructor that creates a bulb with specified max luminescence.
 * <p>
 This class has methods to turn on and turn off the bulb and to increase and
 to decrease the current luminescence of the bulb.
 If you are interested in Bulb in botany check <a href="http://en.wikipedia.org/wiki/Bulb">this</a>
 *
 * @author Akin Kaldiroglu
 * @author James Gosling
 * @version 1.3.7
 * @see <a href="http://www.javaturk.org">JavaTurk.org</a>
 * @see "To better understand check Internet as to how a bulb works!"
 * @since 1.2
 */
public class Bulb {

    /**
     * Maximum luminescence bulb objects may have.
     */
    public static final int STANDARD_MAX_LUMINESCENCE = 60;
    String name;
    private int currentLuminescence;
    protected int maxLuminescence;

    /**
     * Creates a new Bulb object with standard luminescence.
     */
    public Bulb() {
        maxLuminescence = STANDARD_MAX_LUMINESCENCE;
        currentLuminescence = 0;
        System.out.println("A bulb with max luminescence of " + maxLuminescence + " created.");
    }

    /**
     * Creates a new Bulb object with specified max luminescence
     *
     * @param maxLuminescenceValue Max luminescence of the bulb
     */
    public Bulb(int maxLuminescenceValue) {
        maxLuminescence = maxLuminescenceValue;
        currentLuminescence = 0;
        name = "bulb" + new String((new Integer(maxLuminescence)).toString());
        System.out.println("A bulb " + name + " with max luminescence of " + maxLuminescence + " created.");
    }

    /**
     * Sets max luminescence to specified value
     *
     * @param value Specified max luminescence
     * @exception IllegalArgumentException in case of passing non-positive
     * argument.
     */
    public void setMaxLuminescence(int value) throws IllegalArgumentException {
        if (value <= 0) {
            throw new IllegalArgumentException("Luminescence value passed must be greater than zero: " + value);
        }
        maxLuminescence = value;
    }

    /**
     * Gets max luminescence of the bulb.
     *
     * @return max luminescence.
     */
    public int getMaxLuminescence() {
        return maxLuminescence;
    }

    /**
     * Turns on the bulb. Curent luminescence is set to max luminescence.
     */
    public void on() {
        currentLuminescence = maxLuminescence;
        System.out.println("Bulb  " + this.name + " is on now");
    }

    /**
     * Turns off the bulp. Curent luminescence is set to 0.
     */
    public void off() {
        currentLuminescence = 0;
        System.out.println("Bulp  " + this.name + " off now");
    }

    /**
     * Just brightens the bulp.
     */
    public void brighten() {
        System.out.println("Bulb  " + this.name + " is brighter now");
    }

    /**
     * Brightens the bulb to specified value.
     *
     * @param value New luminescence of the bulb.
     * @exception IllegalArgumentException When passed value is negative.
     * @throws BulbBlownException When passed value is greater than {@link #STANDARD_MAX_LUMINESCENCE}
     * argument.
     */
    public void brighten(int value) throws IllegalArgumentException, BulbBlownException {
        if (value <= 0) {
            throw new IllegalArgumentException("Luminescence value passed must be greater than zero: " + value);
        }

        if (currentLuminescence < value) {
            if (value <= maxLuminescence) {
                currentLuminescence = value;
                System.out.println("Luminescence of " + this.name + " is increased to " + currentLuminescence);
            } else {
                throw new BulbBlownException(value);
            }
        } else {
            System.out.println("Do you want to make " + this.name + " brighter or dimmer?");
            System.out.println("Current luminescence of " + this.name + " is " + currentLuminescence);
            System.out.println("You tried to brighten it to " + value);
        }
    }

    /**
     * Just dims the bulb.
     */
    public void dim() {
        System.out.println("Bulb  " + this.name + " is dimmer now");
    }

    /**
     * Dims the bulb to specified value.
     *
     * @param value New luminescence of the bulb
     * @throws IllegalArgumentException When passed value is negative.
     */
    public void dim(int value) throws IllegalArgumentException {
        if (value <= 0) {
            throw new IllegalArgumentException("Luminescence value passed must be greater than zero.");
        }

        if (currentLuminescence > value) {
            if (value >= 0) {
                currentLuminescence = value;
                System.out.println("Luminescence of " + this.name + " is decreased to " + currentLuminescence);
            } else {
                System.out.println("Don't be that silly! I am just a bulb not a black hole");
            }
        } else {
            System.out.println("Do you want to make " + this.name + " brighter or dimmer?");
            System.out.println("Current luminescence of " + this.name + " is " + currentLuminescence);
            System.out.println("You tried to dim it to " + value);
        }
    }
}
