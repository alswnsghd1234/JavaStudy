package com.kh.operator;

public class C_Compound {
	
	/*
	 * ���� ���� ������ : �ٸ� ��� �����ڶ� ���� �����ڰ� �����Ѱ�, ���׿�����
	 * => �ڱ� �ڽŰ� �ش� ��� ���� �Ŀ� �� ����� �ڱ� �ڽſ��� ���� ����°�.
	 * 
	 * +=
	 * -=
	 * *=
	 * %=
	 * 
	 * ex) a += 3; -> ������ a��� ���� 3�� ���ϰ� a�� �� ������� ���� ����ڴ�.
	 * Ǯ� ������ a = a+3
	 * 
	 * 
	 * */
	
	public void method1() {
		int num = 12;
		
		System.out.println("���� num : " + num);
		
		num = num +3;
		System.out.println("3�� ������Ų num :" + num);
		
		//num�� 3��ŭ �������Ѻ���
		
		num -= 3;
		System.out.println("3�� ������Ų num :" + num);
		num *= 3;
		System.out.println("3�� ������Ų num :" + num);
		num -= 2;
		System.out.println("3�� ������Ų num :" + num);
		num %= 2;
		System.out.println("3�� ������Ų num :" + num);
	}

}
