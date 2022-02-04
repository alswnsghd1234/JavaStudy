package ch03;

public class Student {

	int studentID;
	String studentName;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "dd" + studentName + "wf" + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentInfo(String name) {
		studentName = name;
	}
	
}
