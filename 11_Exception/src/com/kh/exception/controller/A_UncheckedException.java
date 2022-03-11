package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * RuntimeException
	 * ���α׷� ����� �߻��Ǵ� ����
	 * 
	 * RuntimeException�� �ڽ� Ŭ������
	 * -ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� �����Ҷ� �߻��ϴ� ����
	 * -ClassCastException : ����� �� ���� ����ȯ�� ����� ��� �߻��ϴ� ����
	 * -NullPointerException : �����ϴ°��� ������� null�ӿ��� �����Ϸ��� �Ҷ� �߻��ϴ� ����
	 * -ArithmeticException : 0���� �������� �Ҷ� �߻��ϴ� ����
	 * 
	 * �̷��� RuntimeException�� ���õ� ���ܴ� ����� ���� ������ ��Ȳ�̱� ������
	 * ���� ��ü�� �߻��� �ȵǰ� ���ǹ����ε� ó�� ����
	 * ���� ����ó������ �ʿ����
	 * 
	 * */
	
	//ArithmeticException 
	public void method1() {
		
		//����ڿ��� �ΰ��� �������� �Է¹޾� ������ ��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		//��� 1. ���ǹ����� ó��(���ʿ� ���ܰ� �߻����� �ʰ� ó��)
		
//		if(num2!=0) {
//			System.out.println("������ ��� : "+(num1/num2)); 
//		}else {
//			System.out.println("0���δ� ���� �� �����ϴ�.");
//		}
//		System.out.println("���α׷� ����");
		
		
		//��� 2. ���� ó�� ������ ����ؼ� �ذ��غ���
				//���ܰ� �߻����� ��쿡 ������ ������ �����ϱ�.
				/* try ~ catch���� 
				 * [ǥ����]
				 * 
				 * try{
				 *   
				 *   ���ܰ� �߻��Ұ� ���� ���� 
				 * 
				 * }catch(�߻��� ����Ŭ������ Ŭ����������){
				 *  //�ش� ���ܰ� �߻������� ������ ����.
				 * 	
				 * }
				 * */
				
				try {
					System.out.println("������ ��� : "+(num1/num2));
					//ArithmeticException�� �߻��ϸ�?
				}catch(ArithmeticException e) {
					System.out.println("0���� ���� �� �����ϴ�.");
					e.printStackTrace();//���ܰ� ��𿡼� �߻��ߴ��� �ľ��� ���ְ� �޼����� �����.
					//���� ������ ��� �߻��ߴ���,��ε� �� �˷��ش�.
					//���ߴܰ迡���� ����ؾ��� why? ����ڿ��� �����ָ� ���(������ ����ٴ°� �˰ԵǱ� ����)
				}
				
				System.out.println("���α׷� ����");
				
	}
	
	//���� catch���
	public void method2() {
		
		/*
		 * ���� catch ���
		 * catch�� ���ܰ� �������� ��� ���
		 * ���� ���� ���� : ������ ���� �ڽ�Ÿ���� ����Ŭ�������� ����
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�(0����) : ");
		
		try {
		int num = sc.nextInt(); //num�� �������� �ƴ� Ÿ���� ������ InputMismatchException�߻�
		
		System.out.println("������ ��� : "+(20/num)); //num�� 0�̸� ArithmeticException�߻�
		}
		catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���!!!!!����!!");
		}catch(ArithmeticException e ) {
			System.out.println("0���δ� ���� �� �����...");
		}
		
		System.out.println("���α׷� ����");
		
	}
	

	}
	
	
	
	
	

}
