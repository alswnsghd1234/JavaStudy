package com.kh.array;

public class C_DimentionArray {

	/*
	 * ������ �迭 ����
	 * �ڷ���[] �迭�̸�;
	 * �ڷ��� �迭�̸�[];
	 * 
	 * ������ �迭 ����
	 * �ڷ���[][] �迭�̸�;
	 * �ڷ���[] �迭�̸�[]'
	 * �ڷ��� �迭�̸�[][];
	 * 
	 * �ڷ���[][] �迭�̸� = new �ڷ���[���Ǳ���][���Ǳ���]
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public void method1() {
		
		int[][] arr2 = new int[3][5];
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
			
			for(int j=0;j<arr2.length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}
}
