package com.kh.variable;

public class C_Cast {

	public void autoCasting() {
		
		int i1 = 10;
		double d1 = i1;
		
		System.out.println("d1 : "+ d1);
		
		int i2 =12;
		double d2 = 3.3;
		
		double result = i2 + d2;
		
		System.out.println("result"+result);
		
		// int(4btye) -> long(8byte)
		int i3 = 1000;
		long l3 = i3; //1000
		
		long l4 = 2000; //L�� ������ �ʾƵ� ���� �߻� X => �ڵ� ����ȯ
		
		// Ư�����̽� long(8byte) -> float(4btye)
		// ������ �Ǽ��� ��� �� ū �������� ������ ���� �������� �Ǽ��� ������ ����!
		// float�� 4btye���� ǥ�� �� �� �ִ� ������ �� �б� ����.
		
		long l5 = 10000000;
		float f5 = l5;
		
		System.out.println("f5 : "+ f5);
		
		//Ư�����̽�. char ->(2btye) -> int(4btye) : ���ڶ� int�� ��������� ����ȯ�� ����
		//���� : �ƽ�Ű�ڵ�ǥ
		char ch = 65;
		System.out.println("ch : "+ch);
		ch = 66;
		System.out.println("ch : "+ch);
		
		System.out.println('��');
		System.out.println((int)'��');
		System.out.println((byte)1+'��'+(char)2);
		
	}
	
	public void forceCastion() {
		// ����� ����ȯ�̶�� �θ���.
		//(�ٲ��ڷ���)��
		
		//1.double -> float
		
		float f1 = 4.0f;
		
		double d2 = 8.0;
		
		float f2 = (float) d2;
		
		//2. double -> int
		double d3 = 13.3;
		int i3 = (int)d3;
		
		System.out.println("f2 + "+f2);
		System.out.println("f2+i3 + "+i3);
		
		int iNum = 10;
		double dNum = 15.5;
		
		System.out.println(iNum+dNum);
		
		int result = (int)(iNum+dNum);
		
		System.out.println(result);
	}
	
	
	
	
}
