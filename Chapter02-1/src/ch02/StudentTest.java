package ch02;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.studentID = 2323;
		student.studentName = "James";
		student.address = "LosAngeles";
		
		student.showStudentInfo();
		
		student.setStudentName("Jory");
		System.out.println(student.getStudentName());
		
		student.showStudentInfo();
		
	}

}
