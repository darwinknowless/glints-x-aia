package aia.learning.trycatchblock;

//block class
public class TryCatchExample6 {
//method main()
	public static void main(String[] args) {

		// declare variable
		int i = 50;
		int j = 0;
		int data;

		// block try-catch
		try {
			data = i / j;// may throw exception

			// handling the exception
		} catch (Exception e) {
			// TODO: handle exception
			// resolving the exception in catch block
			System.out.println(i / (j + 2));
		}
	}
}

// OUTPUT
// 25