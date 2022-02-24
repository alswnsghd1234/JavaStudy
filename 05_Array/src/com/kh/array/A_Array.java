package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	public void method1() {
	/*
	변수 : 하나의 공간에 하나의 값만 넣을 수 있다.
	배열 : 하나의 공간에 여러개의 값을 담을 수 있다.
	단, 같은 자료형들만 담을 수 있다.
	배열의 각 인덱스 위치에 값을 담을 수 있다. ( 방이 나눠져 있음 )
		각 방의 크기가 같다.(자료형크기)
		
		배열의 선언
		[표현법] 자료형[] 배열명;
		
		int[] arr1;
		
		double[] arr2;
		
		배열의 할당
		
		[표현법]
		자료형[] 배열명 = new 자료형[배열의 크기]; // 몇칸짜리 배열을 만들건지
	*/
	
		int[] arr;
		
		arr=new int[5];
		
		int[] arr2 = new int[5];
	
	/*
	 * [표현법]
	 * 1번 인덱스에 10이라는 값을 넣겠다 = arr[1] = 10
	 * 5번 인덱스에 50이라는 값을 넣겠따 = arr[5] = 50
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
		
		String[] movie = new String[] {"나혼자산다","소아","황소"};
		String[] movies = new String[] {"이게","지금","맞는거지"};
		
		for(int i=0;i<movies.length;i++) {
			System.out.println(movies[i]);
		}
	}
	
	public void method6() {
		
		//사용자에게 입력을 통해 배열에 값을 담아서
		//해당 배열에 가장 작은 값 즉 최소값을 구하는 프로그램을 만들어 봅시다.
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("정수 입력");
			
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
		
		//사용자에게 입력을 통해 배열에 값을 담아서
		//해당 배열에 가장 작은 값 즉 최소값을 구하는 프로그램을 만들어 봅시다.
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("정수 입력");
			
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
	
	
	