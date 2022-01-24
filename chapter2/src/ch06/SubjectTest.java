package ch06;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 70);
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("국어", 45);
		studentKim.setMathSubject("수학", 24);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	
	}
}
