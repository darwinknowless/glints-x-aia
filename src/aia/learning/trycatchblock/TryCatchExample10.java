package aia.learning.trycatchblock;

//import library FilenotFoundException & PrintWriter
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//block class
public class TryCatchExample10 {
	// method main()
	public static void main(String[] args) {

		PrintWriter pw;
		// block try-catch
		try {
			pw = new PrintWriter("jtp.txt"); // may throw exception
			pw.println("saved");

			// providing the checked exception handler
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}
}

// OUTPUT
// File saved successfully