package Test2;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student studentJ = new Student("Edward",20000);
		
		Taxi �߰��ٿ���ý� = new Taxi("�߰���");
		
		studentJ.takeTaxi(�߰��ٿ���ý�);

		studentJ.showInfo();
}
}
