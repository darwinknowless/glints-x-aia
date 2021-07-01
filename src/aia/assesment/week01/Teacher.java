package aia.assesment.week01;

//import library
import java.util.ArrayList;
import java.util.List;

// block class
public class Teacher extends Person {
	// create array list
	ArrayList<String> courses = new ArrayList();
	// declare variable
	static int numCourses;

	// block class
	public Teacher() {
		this.courses = courses;
		this.numCourses = numCourses;
	}

	// block class
	public boolean addCourse(String course) {
		// declare variable
		boolean ans = courses.contains(course);
		// block if/else loop
		if (ans == true) {
			System.out.println("The course already existed");
		} else {
			System.out.println("The course doesn't existed");
			this.courses.add(course);
		}
		return ans;
	}

	// block class
	public boolean removeCourse(String course) {
		// declare variable
		boolean ans = courses.contains(course);
		// block if/else loop
		if (ans == true) {
			System.out.println("The course already existed");
			this.courses.remove(course);
		} else {
			System.out.println("The course doesn't existed");
		}
		return ans;
	}

	// block class
	public List<String> showCourse() {
		// create array list
		List<String> studentCourses = new ArrayList();
		// block for loop
		for (String course : courses) {
			System.out.println(studentCourses.add(course));
		}
		return studentCourses;
	}
}
