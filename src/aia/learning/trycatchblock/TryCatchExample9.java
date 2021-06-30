package aia.learning.trycatchblock;

//block class
public class TryCatchExample9 {
//method main()
	public static void main(String[] args) {
		// block try-catch
		try {
			int arr[] = { 1, 3, 5, 7 };
			System.out.println(arr[10]); // may throw exception

			// handling the array exception
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}

// OUTPUT
// java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
// rest of the code