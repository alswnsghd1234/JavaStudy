package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{

	//�θ�κ��� ��ӹ��� �κ��� ������� �ʴ´�.
	//��, ���� �������̵� �� �޼ҵ�� ����ص� �ȴ�.
	
	//[�ʵ��]
	//brand,pCode,pName,price //���
	
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand,String pCode,String pName,int price,boolean allInOne) {
		//�ʱ�ȭ ��� 3����
		//1. �θ�Ŭ������ �ʵ���� ���� �����ڸ� private���� protected�� ����
		//2. �θ� Ŭ������ setter�� �̿��Ͽ� �ʱ�ȭ ��Ű�� ���
		//3. �θ� Ŭ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ �ϴ� ��� super()
		
		//1��������� �ʱ�ȭ�غ���
		super.brand=brand;
		super.pCode=pCode;
		super.pName=pName;
		super.price=price;
		this.allInOne=allInOne;
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	//�ϴ� ��������� �ʼ��� �����ؾ��ϴ� �κ�
	
	//�������̵�
	
	@Override
	public String info() {
		return super.info()+",allInOne "+allInOne;
	}
}
