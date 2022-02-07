package ch02;

public class VIPCustomer extends Customer{


	String agentID;
	double saleRatio;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade  ="VIP";
	}
	
}
