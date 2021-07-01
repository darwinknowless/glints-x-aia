package aia.assesment.week01;

//block class
public class Main {
	// method main()
	public static void main(String[] args) {
		// declare student
		Student newStudent = new Student();
		newStudent.setName("Darwin Knowless");
		newStudent.setAddress("Ancol, Jakarta Utara");
		System.out.println(newStudent.getName());
		System.out.println(newStudent.getAddress());
		newStudent.addCourseGrade("Accounting", 90.0);
		newStudent.addCourseGrade("Social", 70.0);
		newStudent.addCourseGrade("Biology", 80.0);
		System.out.println(newStudent.printGrades());
		System.out.println(newStudent.getAverageGrade());

		// declare teacher
		Teacher newTeacher = new Teacher();
		newTeacher.setName("Knowless Ddarwin");
		newTeacher.setAddress("Pondok Indah, Jakarta Selatan");
		newTeacher.addCourse("Accounting");
		newTeacher.addCourse("Accounting");
		newTeacher.addCourse("Social");
		newTeacher.addCourse("Javanese");
		;
		newTeacher.addCourse("Japanese");
		newTeacher.removeCourse("Javanese");
		System.out.println(newTeacher.showCourse());
		newTeacher.addCourse("Javanese");
	}
}
