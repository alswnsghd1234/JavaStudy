package Test2;

public class Taxi {

	String taxi;
	int money;
	
	public Taxi(String taxi){
		this.taxi = taxi;
	}
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxi+"������"+money+"�� �Դϴ�.");
	}
}
