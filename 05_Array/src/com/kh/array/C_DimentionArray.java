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
}
