package com.kh.variable;

public class A_Variable {
	
	//������ �ʿ伺
	// �ñް� �ٹ��ð�, �ٹ��ϼ� ���ؼ� ������ ����ϴ� �޼ҵ带 ����� ���ô�.
	
	public void calPay() {
		System.out.println("----���� ��� ��----");
		
		System.out.println("�ñ� : 8980��");
		System.out.println("�ٹ��ð� : 6�ð�");
		System.out.println("�ٹ��ϼ� : 8��");
		
		//���� = �ñ� X �ٹ��ð� X �ٹ��ϼ�
		//�̸� :00000�� �̷� ���·� ��µǱ⸦ ���Ѵ�.
		//���ڸ� ���Ҷ� +�� ����Ѵ�.
		//���ڿ� ���ڸ� ���� ���ϸ� ���ڸ� ���ڷ� �ν��Ѵ�.
		//�׷��� ������ ���ڿ����� ���ϴ� ��쿡�� �Ұ�ȣ()�� �̿��ؼ� ���� �����Ŀ� ���ڿ��� �����ش�.
		
		System.out.println("������: "+(8980*6*8)+"��");
		System.out.println("����: "+(8980*6*8)+"��");
		System.out.println("��: "+(8980*6*8)+"��");
		
		System.out.println("----���� ��� ��----");
		
		int pay = 8980; //�ñ�
		int time = 6; //�ð�
		int day = 8; //�ٹ��� ��
		
		int total = (pay*time*day);
		
		System.out.println("������: "+(total)+"��");
		System.out.println("����: "+(total)+"��");
		System.out.println("��: "+(total)+"��");
		
		
		// = : �ڹٿ����� ����, �� ������ �����͸� ���ʿ� �ִ´�.
		
		/*
		 ������ ����ϴ� ����
		 1. ������ �켱������ ���� �ǹ̸� �ο��ϱ� ���� ��� => ������ ������
		 2. �� �ѹ� ���� ����ϰ� �ʿ��� ������ ��� ���� => ���뼺�� ������
		 3. ������ + ���뼺 =>���������� ���� �� �� �ִ�.
		 */
	}
	
	public void contant() {
		
		//ǥ���� : final �ڷ��� ����̸�;
		
		//���� �̿�� 
		int age = 20;
		System.out.println("age�� "+ age);
		
		age = 21;
		System.out.println("age��"+ age);
		
	}
	
	
}
