package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(1233,"ki",33);
		System.out.println(studentKim.showStudentInfo());
	}
}
