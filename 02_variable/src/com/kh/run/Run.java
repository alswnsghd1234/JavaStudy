package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.*;

public class Run {

	public static void main(String[] args) {
		
		A_Variable ab = new A_Variable();
//		ab.calPay();
//		declareVariable();
//		ab.contant();
		
		C_Cast c = new C_Cast();
//		c.autoCasting();
//		c.forceCastion();
		
		D_printf f = new D_printf();
		f.printfTest();
		
		
	}
	// ������ ����
	
	public void declareVariable() {
		/*
		 ������ ����
		 > ���� ���� ������ ���� �޸� ������ Ȯ���ϰڴ�.
		 [ǥ����] �ڷ��� �����̸�;
		 
		 �ڷ��� : ������ Ÿ���� ��Ÿ���� �κ�(ũ�� �Ǵ� ����)
		 ���� �̸� : ������ �̸��� ���ϴ� �κ�(��� �θ�����)
		 
		 ������ ���� �� �� ������ ��
		 �����̸� �׻� �ҹ��ڷ� �����Ѵ�.�� ī��ǥ����� ��Ų��.
		 ���� �����ȿ� {} �ȿ��� ������ �������� ���� �� �� ����.
		 �ش� ������ ����� ������ �ش� ���������� ����� �����ϴ�.
		 -> �ٸ� �޼ҵ忡���� ��� �Ұ� => �������� ����
		 
		 */
//		1. ���� �ڷ���(���� : true / false)
		boolean isTrue; // 1byte
		boolean isFalse;
		
		isTrue = true;
		isFalse = false;
		
		isTrue = 3+3 <9;

//		2. ������ �ڷ���
//		���� �ڷ��� ���� ��쿣 ����� ���� ������ �� �ִ� ���� ������ �ٸ���.
		byte bNum; 
		short sNum;
		int iNum;
		long lNum;
		
		bNum =1;
		sNum=2;
		iNum=4;
		lNum=8L;
		
//		3. �Ǽ���
		float fNum = 4.0f;
		double dNum = 8.123456789101112131415; // �Ҽ��� 15��° �ڸ����� ǥ�� ����(������ ©����)
		
		//������
		
		char ch; // 2byte
		ch='a'; //���� �ϳ��� �ݵ�� Ȭ����ǥ �ȿ� �־���Ѵ�.
		ch=65; //�������� �Ѱ��� ���� �� �� �־ �ٸ� ���� ������ ����� �ȴ�.(������ ����)
		
		//���ڿ�
		
		String str;
		str = "abc"; // ���ڿ��� �ݵ�� ""(�ֵ���ǥ) �ȿ� �־�� �Ѵ�.
		
		System.out.println(isTrue);
		System.out.println(isFalse);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
		
		
	}
	
}
