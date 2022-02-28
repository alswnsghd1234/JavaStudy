package com.kh.array;

public class C_DimentionArray {

	/*
	 * 일차형 배열 선언
	 * 자료형[] 배열이름;
	 * 자료형 배열이름[];
	 * 
	 * 이차원 배열 선언
	 * 자료평[][] 배열이름;
	 * 자료형[] 배열이름[]'
	 * 자료형 배열이름[][];
	 * 
	 * 자료형[][] 배열이름 = new 자료형[행의길이][열의길이]
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
		//반복문을 활용하여 1~ 15까지 차례대로 값을 넣고 출력해보세요.
		
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
		 * 가변 배열 
		 * 행의 크기는 정해져있으나 열의 개수가 정해져있지 않은 상태.
		 * 이차원배열 -> 배열이 묶여있는 상태
		 * 하지만 묶여있는 배열들의 크기가 같을 필요는 없음. -> 가변배열
		 * 행의 크기는 생략불가, 열의 크기는 생략 가능
		 * 열의 크기는 변경 가능하다. //주의)배열은 크기를 변경할 수 없음
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
