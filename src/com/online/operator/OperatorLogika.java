package com.online.operator;

//Block Class
public class OperatorLogika {
	// Method main()
	public static void main(String[] args) {
		// Declare variable
		boolean a = true;
		boolean b = false;
		boolean c;

		// Konjungsi && (dan)
		c = a && b;
		System.out.println("true && false = " + c);

		// Disjungsi || (atau)
		c = a || b;
		System.out.println("true && false = " + c);

		// Negasi ! (bukan)
		System.out.println("Negasi, !true = " + !a);
	}

}
