package ch03;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "�й��� �̸���" + studentName + "�̰�, �ּҴ�"+address+"�Դϴ�.");
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
