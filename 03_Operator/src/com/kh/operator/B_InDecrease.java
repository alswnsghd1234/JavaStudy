package com.kh.operator;

public class B_InDecrease {

	/*
	 * ���� ������ : ���׿����ڷμ� �ѹ��� 1������(���ϰų�) ����(���ų�) �ϴ� ������ �Ѵ�.
	 * -> ���� ������ �Ұ���, ���߿� ������ �Ұ��� �������� ��ġ�� ���� �޶�����.
	 * 
	 * [ǥ����]
	 * ++ : ���� 1���� ���� ��Ű�� ������.
	 * -- : ���� 1���� ���� ��Ű�� ������.
	 * 
	 * �������� ��ġ
	 * �������� : ++��, --�� -> ���� 1�� �����Ǵ� ���� ��Ű�� �� ���� ó��
	 * �������� : ��++, ��-- -> ���� ���� ó���ϰ�(Ÿ������ ���� ������) 1 ���� �Ǵ� ����
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public void method2() {
		
		int a = 10;
		int b = a++;
		
		int c = 10;
		int d = c;
		
		
	}
	public void method3() {
		int a = 10;
		int b = ++a;
		
		System.out.println("a :"+a);
		System.out.println("a :"+b);
		System.out.println("a :"+--a);
	}
	public void method4() {
		int num1 = 20;
		int result1 = num1++ *3;
		
		System.out.println("num1 : "+num1);
		System.out.println("result1 : "+result1);
		
		int num2 = 20;
		int result2 = ++num2 *3;
		
		System.out.println("num2 :"+num2);
		System.out.println("result2 :"+result2);
	}
}
