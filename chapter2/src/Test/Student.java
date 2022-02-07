package Test;

public class Student {
	int height;
	int weight;
	String gender;
	String StudentName;
	int StudentAge;
	
	public void showInfo() {
		System.out.println("키가"+height+"이고 몸무게가"+ weight+"킬로인"+gender+"이 있습니다. 이름은"+ StudentName+"이고 나이는" + StudentAge + "세 입니다.");
	}
}
