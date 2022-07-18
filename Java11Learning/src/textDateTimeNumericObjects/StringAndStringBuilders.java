package textDateTimeNumericObjects;

public class StringAndStringBuilders {

	public static void main(String[] args) {
		String teaText = "TEA";
		String b = "TEA";
		System.out.println(teaText == b); // points to same place - true
		String c = new String("TEA");
		System.out.println(teaText == c); // different object - false
		String d = c.intern(); // creates a replica which is same as teaText and b
		System.out.println(d == b); // as we do intern with c - true

		// operations
		c = teaText + ' ' + b;
		System.out.println(c);
		System.out.println(c.indexOf('T')); // starts from 0
		System.out.println(c.indexOf('T', 1)); // starts from 1
		System.out.println(c.lastIndexOf('T')); // looks from the back
		System.out.println(c.substring(c.lastIndexOf('T'), c.lastIndexOf('T') + 2));
		System.out.println(c.substring(4, 6));

		// stringbuilder
		StringBuilder txt = new StringBuilder(c);
		System.out.println(txt.capacity()); // size of internal storage with sb object
		txt.replace(0, 3, "What is the price of");
		System.out.println(txt.toString()); // text will be replaced
		System.out.println(txt.capacity()); // capacity will be increased
		// capacity will be rescaled automatically even if we give an initial value.

	}

}
