package ch03;

public class StudentTest {
	
	public static void main(String[] agrs) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 12341;
		studentLee.studentName = "dfdfd";
		studentLee.address = "Dfd";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 233;
		studentKim.studentName = "ddfd";
		studentKim.address = "ppgg";
		
		studentKim.showStudentInfo();
}
}
