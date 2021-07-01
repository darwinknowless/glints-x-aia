package aia.assesment.week02.reversedstring;

// block class
public class ReversedString {
	// method main()
	public static void main(String[] args) {
		// declare variable
		String name = "Darwin Knowless";
		String reversed = "";

		// block for
		for (int i = name.length() - 1; i >= 0; --i) {
			reversed += name.charAt(i);
		}
		// result
		System.out.println(reversed);
	}

}
