package aia.learning.trycatchblock;

//block class
public class TryCatchExample7 {
	// method main()
	public static void main(String[] args) {
		// block try-catch
		try {
			int data1 = 50 / 0; // may throw exception

			// handling the exception
		} catch (Exception e) {
			// TODO: handle exception
			// generating the exception in catch block
			int data2 = 50 / 0;
		}
		System.out.println("rest the code...");
	}
}

// OUTPUT
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * aia.learning.trycatchblock.TryCatchExample7.main(TryCatchExample7.java:15)
 */
