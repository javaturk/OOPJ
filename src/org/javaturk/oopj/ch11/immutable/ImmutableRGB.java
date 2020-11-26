package org.javaturk.oopj.ch11.immutable;

/**
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html
 * 
 * @author akin
 *
 */
public class ImmutableRGB {

	// Values must be between 0 and 255.
	final private int red;
	final private int green;
	final private int blue;
	final private String name;

	public ImmutableRGB(int red, int green, int blue, String name) {
		check(red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.name = name;
	}

	private void check(int red, int green, int blue) {
		if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255)
			throw new IllegalArgumentException();

	}

	public ImmutableRGB invert() {
		return new ImmutableRGB(255 - red, 255 - green, 255 - blue, "Inverse of " + name);
	}
	
	public int getRGB() {
		return ((red << 16) | (green << 8) | blue);
	}

	public String getName() {
		return name;
	}
}