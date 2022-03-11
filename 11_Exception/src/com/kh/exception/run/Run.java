package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.BCheckedException;

public class Run {

	public static void main(String[] args) {

		/*
		 * ����(����)�� ����
		 * - �ý��� ���� : ��ǻ���� ���۵����� ���� �߻��ϴ� ����
		 * - ������ ���� : ���α׷� ���� �� �ҽ��ڵ���� �������� ������ �߻��ϴ� ����
		 * -> �ҽ��ڵ� �������� �ذ�(�����ٷ� ����)
		 * -��Ÿ�� ���� : ���α׷� ������ �߻��ϴ� ����
		 *  - �ҽ��ڵ���� ������ ���µ��� �߻�(������� �߸� �Ǵ� �����ڰ� ����� �� ó���� �� �س��� ���)
		 *  
		 * - �� ���� : �ҽ��ڵ���� �������� ������ ���� �������� ���� ������ ���� ������ ���α׷��� �ǵ��� ���� �ʴ°�
		 * (��ȹ�� ���谡 �߸��� ���)
		 * 
		 * ���� : �ý��� ������ ������ ������ ������, �� ������ ���� ���� �� �ɰ��� ������ Ư���� ��Ÿ�� ������ �ַ� ���ܷ� �ٷ�
		 * 
		 * ���� ó�� : ���ܵ��� �߻����� ��츦 ����ؼ� ó���ϴ� ����� �����صδ� ��.
		 * 
		 * ���� ó�� ���� : ���� �߻� �� ���α׷��� ������������ ����Ǵ°��� ���� ����.
		 * 
		 * ���
		 * 1.try ~ catch ���� �̿�
		 * 2. throws �� ���� ������(�̷��) -> ������ �߻��� �޼ҵ忡 ���ܸ� �� �޼ҵ带 ȣ���� ������ �ѱ��.
		 * 			���������� �ѱ�� main���� ó���������
		 * 
		 * 
		 * */
		A_UncheckedException a = new A_UncheckedException();
		
		a.method1();
		
		BCheckedException b = new BCheckedException();
		try {
		b.method4();
	}catch(Exception e) {
		System.out.println("�� ó���Ƴ�");
		e.printStackTrace();
	}
	}

}
