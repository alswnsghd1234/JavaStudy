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
	public void method2() {
		
		int[][] arr = new int[3][5];
		int count = 1;
		//�ݺ����� Ȱ���Ͽ� 1~ 15���� ���ʴ�� ���� �ְ� ����غ�����.
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = count++;
				System.out.printf("%5d",arr[i][j]);
				System.out.println("");
			}
			
		}
		
	}
	public void method3() {
		
		/*
		 * ���� �迭 
		 * ���� ũ��� ������������ ���� ������ ���������� ���� ����.
		 * �������迭 -> �迭�� �����ִ� ����
		 * ������ �����ִ� �迭���� ũ�Ⱑ ���� �ʿ�� ����. -> �����迭
		 * ���� ũ��� �����Ұ�, ���� ũ��� ���� ����
		 * ���� ũ��� ���� �����ϴ�. //����)�迭�� ũ�⸦ ������ �� ����
		 * in[][] arr = new int[5][];
		 * 
		 * 
		 * */
		
		int[][] arr = new int[3][];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr.length);
		
		arr[0] =new int[3];
		arr[1] =new int[5];
		arr[2] =new int[1];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]+=1;
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
