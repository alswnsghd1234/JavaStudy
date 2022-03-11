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
	 * RuntimeException ���� ����
	 * 
	 * -���ǹ����� �ذᰡ�� : ���� ��ü�� �߻� �ȵǰ� �����ڰ� �ҽ��ڵ�� �ڵ鸵 �ϴ°� (����ó��X)
	 * -����ó���������� �ذᰡ�� : ���ܰ� �߻����� �� � ó���Ұ����� �����صδ°�
	 * 
	 * -���� ������ ��Ȳ : ���ǹ����� �ذ�(�� ����) 
	 * -������ �Ұ����� ��Ȳ : ����ó���������� �ذ�
	 * 
	 * RuntimeException �迭�� ���ǹ����� ó���� �� �ִٸ� �� ����� �� �����Ѵ�.
	 * ->����ó���� �ʼ��� �ƴ� "UncheckedException" 
	 * 
	 * ���� catch��
	 * -���� �������� ū ������ catch�ؾ� �ϴ� ������ 
	 * -������ �θ�Ŭ������ exception���� �� ó���ع����� �Ʒ��ִ� �ڽ� Ŭ����Ÿ�Կ� ��ȸ�� ���� ���� 
	 * -�����ϰ� ������ ���� ó���� �ϰ� �ʹٸ� ���������� ���� ������ �ۼ� 
	 * -�Ѱ��� catch������ �����ϸ� �������� �پ�Ѱ� try catch������ ���������� �ȴ�.
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
		catch(ArithmeticException e ) {
			System.out.println("0���δ� ���� �� �����...");
//			e.printStackTrace();
			}
		catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���!!!!!����!!");
//			e.printStackTrace(); ���� ����
		
		System.out.println("���α׷� ����");
		
		}
	}
	
	public void method3() {
		
		//�迭Ȱ��
		//ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
		//NegativeArraySizeException : �迭�� ũ�⸦ ������ ���������� �߻��ϴ� ����
		
		//����ڷκ��� �迭�� ũ�⸦ �Է¹ް� �迭 �����
		//100�� �ε����� ���� ����ϱ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭�� ũ�⸦ �Է����ּ��� (����X) : ");
		
		int size = 0;
		
		try {
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println(arr[100]);
		}
		catch(RuntimeException e) { //�������� ����Ǿ ������ �� ��ƹ����� ������ �Ʒ��� �ڽ�Ŭ�����鿡�� ��ȸ�� ����.
			System.out.println("�����Ҷ� ������");
			
			//���� �ѹ��� ����ó�� �Ŀ� Ÿ�԰˻縦 �ϰ� �ʹٸ� instanceof �����ڸ� ����ϸ� �ȴ�.
//			if(e instanceof InputMismatchException) {
//				System.out.println("InputMismatchException�� �ش��ϴ� ����");
//			}else if(e instanceof NegativeArraySizeException) {
//				System.out.println("NegativeArraySizeException�� �ش��ϴ� ����");
//			}
		}
//		catch(InputMismatchException e) {
//			System.out.println("������ �Է����ּ��� �������ƴ� ;;");
//		}
//		catch(NegativeArraySizeException e) {
//			System.out.println("�迭�� ũ��� ������ �� �� �����ϴ�; ");
////			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�� ũ�⸦ ������ϴ�."+(size-1)+"�ε������� �������ּ���");
//		}
		
		System.out.println("���α׷�����");
		
	}
	
	
	//������ �ƴ� exception�� try catch������ ��ƺ���.
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
	
		int arr =0;
		try {
			arr = sc.nextInt();
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			
			
			
			int[] a = new int[arr];
			
			a[0] = num/num2;
		}
		catch(InputMismatchException e){
			System.out.println("������ �Է����ּ��� �������ƴ� ;;");
		}
		catch(NegativeArraySizeException e ) {
			System.out.println("�迭�� ũ��� ������ �� �� �����ϴ�; ");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			
			System.out.println("�迭�� ũ�⸦ ������ϴ�."+(arr-1)+"�ε������� �������ּ���");
		}
		
		
	}
	
	
	
	
	
	
}
