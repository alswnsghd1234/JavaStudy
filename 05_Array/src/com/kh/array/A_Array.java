package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	public void method1() {
	/*
	���� : �ϳ��� ������ �ϳ��� ���� ���� �� �ִ�.
	�迭 : �ϳ��� ������ �������� ���� ���� �� �ִ�.
	��, ���� �ڷ����鸸 ���� �� �ִ�.
	�迭�� �� �ε��� ��ġ�� ���� ���� �� �ִ�. ( ���� ������ ���� )
		�� ���� ũ�Ⱑ ����.(�ڷ���ũ��)
		
		�迭�� ����
		[ǥ����] �ڷ���[] �迭��;
		
		int[] arr1;
		
		double[] arr2;
		
		�迭�� �Ҵ�
		
		[ǥ����]
		�ڷ���[] �迭�� = new �ڷ���[�迭�� ũ��]; // ��ĭ¥�� �迭�� �������
	*/
	
		int[] arr;
		
		arr=new int[5];
		
		int[] arr2 = new int[5];
	
	/*
	 * [ǥ����]
	 * 1�� �ε����� 10�̶�� ���� �ְڴ� = arr[1] = 10
	 * 5�� �ε����� 50�̶�� ���� �ְڵ� = arr[5] = 50
	 * */
	
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		double[] dArr = new double[2];
		
		dArr[0]=10.5;
		dArr[1]=11.5;
		dArr[2]=15.5;
		
		char[] cArr = new char[4];
		
		cArr[0]='a';
		cArr[1]='b';
		cArr[2]='c';
		
		System.out.println(dArr[0]);
		
	}
	public void method3() {
		String [] kh = new String[5];
		
		kh[0] = "ddd";
		kh[1] = "ggg";
		kh[2] = "eee";
		kh[3] = "qqq";
		kh[4] = "bbb";
		
		for(int i=0;i<=4;i++)
			System.out.println(kh[i]);
	}
	public void method5() {
		
		String[] movie = new String[] {"��ȥ�ڻ��","�Ҿ�","Ȳ��"};
		String[] movies = new String[] {"�̰�","����","�´°���"};
		
		for(int i=0;i<movies.length;i++) {
			System.out.println(movies[i]);
		}
	}
	
	public void method6() {
		
		//����ڿ��� �Է��� ���� �迭�� ���� ��Ƽ�
		//�ش� �迭�� ���� ���� �� �� �ּҰ��� ���ϴ� ���α׷��� ����� ���ô�.
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("���� �Է�");
			
			arr[i]=sc.nextInt();
		}
		
		int min=10000;
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("min = "+min);
		
	}
	public void method7() {
		
		//����ڿ��� �Է��� ���� �迭�� ���� ��Ƽ�
		//�ش� �迭�� ���� ���� �� �� �ּҰ��� ���ϴ� ���α׷��� ����� ���ô�.
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("���� �Է�");
			
			arr[i]=sc.nextInt();
		}
		
		int min=0;
		
		for(int i=0;i<arr.length;i++) {
			if(min<arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("min = "+min);
	
}
}
	
	
	