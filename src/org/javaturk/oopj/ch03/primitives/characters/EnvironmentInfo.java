package org.javaturk.oopj.ch03.primitives.characters;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>  
 */
public class EnvironmentInfo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Encoding:  \t\t" + isr.getEncoding());

		Locale locale = Locale.getDefault();
		System.out.println("Country: \t\t" + locale.getCountry());
		System.out.println("Display language: \t" + locale.getDisplayLanguage());
		System.out.println("Language: \t\t" + locale.getLanguage());
		System.out.println("Display name: \t\t" + locale.getDisplayName());
		System.out.println("ISO3 Language:  \t" + locale.getISO3Language());

		listCharSets();
	}

	/**
	 * Lists all available character sets in the system.
	 */
	public static void listCharSets() {
		SortedMap charsets = Charset.availableCharsets();
		Set names = charsets.keySet();
		for (Iterator e = names.iterator(); e.hasNext();) {
			String name = (String) e.next();
			Charset charset = (Charset) charsets.get(name);
			System.out.println(charset);
			Set aliases = charset.aliases();
			for (Iterator ee = aliases.iterator(); ee.hasNext();) {
				System.out.println("    " + ee.next());
			}
		}
	}
}
