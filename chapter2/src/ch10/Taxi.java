package ch10;

public class Taxi {

	String companyName;
	int money;
	int passengerCount;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
		
	}
	
	public void take(int money) {
		this.money += money;
		
	}
	
	public void showTaxiInfo() {
		System.out.println(companyName + "��� �ý� ������" + money +"�� �Դϴ�.");
	}
}
