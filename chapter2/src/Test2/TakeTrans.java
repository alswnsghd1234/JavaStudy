package Test2;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student studentJ = new Student("Edward",20000);
		
		Taxi 잘간다운수택시 = new Taxi("잘간다");
		
		studentJ.takeTaxi(잘간다운수택시);

		studentJ.showInfo();
}
}
