package Test2;

public class Student {
	
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(1000);
		this.money -= 3000;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"원 입니다.");
	}
}

