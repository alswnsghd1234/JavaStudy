package com.kh.chap02.loop;

public class C_DoWhile {

	/*
	 * d-while��
	 * ������ ���� �˻� ���� ó�� �ѹ� ������ ���� �ȴ�.
	 * while(false) : ó�� �ѹ��� ����ȴٴ� ��
	 * 
	 * [ǥ����]
	 * 
	 * �ʱ�� // �ʼ��� �ƴ�
	 * 
	 * do {
	 * 		�����ڵ�
	 * 		������ // �ʼ��� �ƴ�
	 * 
	 * 
	 * }while(���ǽ�);
	 * 
	 * whlie���� ����
	 * 
	 * do-while���� ���ǽĿ� ������� ó�� 1ȸ�� ����ȴ�.
	 * while���� ���ǽ��� ��(true)���߸� ����ȴ�.
	 * 
	 * 
	 * 
	 * */
	
	public void method1() {
		do {
			System.out.println("ddd");
			
		}while(false);
		
		
	}
	public void method2() {
		int i =1;
		do {
			
			System.out.println(i);
			i++;
			
		}while(i<=5);
	}
}
