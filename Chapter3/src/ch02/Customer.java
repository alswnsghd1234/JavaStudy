package ch02;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	String agentID;
	double salesRatio;
	
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int salePrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� �����"+ customerGrade+"�̸�, ���ʽ� ����Ʈ��"+bonusPoint +"�Դϴ�.";
	}
}
