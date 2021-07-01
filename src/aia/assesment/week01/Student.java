package aia.assesment.week01;

//import library
import java.util.ArrayList;

//block class
public class Student extends Person {
	// create array list
	ArrayList<String> courses = new ArrayList();
	ArrayList<Double> grades = new ArrayList();
	// declare variable
	static int numCourses;

	// block class
	public void addCourseGrade(String course, Double grade) {
		this.courses.add(course);
		this.grades.add(grade);
		System.out.println(this.courses);
		System.out.println(this.grades);
	}

	// block class
	public Double printGrades() {
		Double studentGrade = 0.00;
		for (Double grade : grades) {
			studentGrade += grade;
		}
		return studentGrade;
	}

	// block class
	public Double getAverageGrade() {
		int gradeLeng = grades.size();
		Double gradeTotal = 0.0;
		for (Double grade : grades) {
			gradeTotal += grade;
		}
		return gradeTotal / gradeLeng;
	}
}
