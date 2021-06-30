package aia.learning.trycatchblock;

//Block class
public class TryCatchExample1 {
	// Method main()
	public static void main(String[] args) {
		// May throw exception
		int data = 50 / 0;
		System.out.println("Rest of code...");
	}

}
//RESULT is ERROR
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * aia.learning.trycatchblock.TryCatchExample1.main(TryCatchExample1.java:8)
 * 
 * As displayed in the above example, the rest of the code is not executed (in
 * such case, the rest of the code statement is not printed).
 * 
 * There can be 100 lines of code after exception. So all the code after
 * exception will not be executed.
 */
