
package org.javaturk.oopj.ch08;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Window {
	boolean open;
	int width;

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void open(){
		open = true;
	}
	
	public void close(){
		open = false;
	}
	
	public static void main(String[] args) {
		Window window = new Window();
		window.setOpen(true);
		System.out.println("Open? : " + window.isOpen());
		
		window.close();
		System.out.println("Open? : " + window.isOpen());
	}
}
