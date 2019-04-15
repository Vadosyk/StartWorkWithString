package ua.com.qalight.excemples;

import java.util.Random;
import java.util.logging.Logger;



public class UsingStringBuilder {
	private static Logger logger = Logger.getLogger(UsingStringBuilder.class.getName());
	public static Random rand = new Random(47);
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < 47; i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length()-2, result.length());
		return result.toString();
	}

	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		logger.info(usb + "]");

	}

}
