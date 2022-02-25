package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	
	/*
	 * 배열복사
	 * 1. 얕은 복사: 배열의 주소값만 복사한다. (같은 객체를 참조한다.)
	 * 2. 깊은 복사: 새로운 배열을 만들고 기존 배열에 있는 데이터를 복사한다.
	 *  
	 * */

	//얕은 복사
	
	public void method1() {
		
		int[] origin = new int[5];
		
		
		for(int i=0;i<origin.length;i++) {
			origin[i]+=2*i;
		}
		System.out.println("기존 배열 출력===");
		for(int i=0;i<origin.length;i++) {
			System.out.println(origin[i]);
		}
		//배열 얕은 복사
		int[] copy = origin;
		
		System.out.println("복사본 배열 출력===");
		
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
		}
		
		origin[2] =100;
		
		System.out.println("=====기존 배열 수정 후 기존 배열 값 출력====");
		for(int i=0;i<origin.length;i++) {
			System.out.println(origin[i]);
		}
		System.out.println("===기존 배열 수정 후 복사 배열 값 출력====");
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
			}
		
	}
	public void method2() {
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[origin.length];
		
		for(int i=0;i<origin.length;i++) {
			copy[i] = origin[i];
			System.out.println(copy[i]);
		}
		
	}
	public void method3() {
		
		int[] origin = {5,10,15,20,25};
		
		int[] copy = new int[10];
		
//		System.arraycopy(origin, 0, copy, 0, 5);
//		System.arraycopy(origin, 3, copy, 0, 2);
		System.arraycopy(origin, 0, copy, 5, 5);
		for(int i=0;i<origin.length;i++) {
		System.out.println(copy[i]);
	}
		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
		}
	public void method4() {
		
		String[] sArr = {"a","b","c","d","e","f"};
		
		//[표현법] 복사본 배열 = Arrays.copyOf(원본배열,새로운배열길이)
		
		//길이를 원본보다 작게 설정하면 그만큼만 복사된다.
		String[] copy=Arrays.copyOf(sArr, 10);
		
		for(int i=0; i<copy.length;i++) {
			System.out.println(copy[i]);
		}
		
		System.out.println(sArr.hashCode());
		System.out.println(copy.hashCode());
	}
	/*
	 * System.arraycopy 메소드
	 * 몇번 인덱스에서 부터 몇개까지 할건지 설정이 가능하다.
	 * 
	 * Arrays.copyOf 메소드
	 * 인덱스 설정이 불가능하고 원본 배열의 0번 인덱스에서 부터 시작된다.
	 * 내가 제시한 개수만큼 복사되고 그 제시한 수가 곧 배열의 크기로 지정된다.
	 * 
	 * */
	
	//깊은 복사
	//clone 이용해보기.
	public void method5() {
		//[표현법] 복사본 배열 = 원본배열.clone();
		
		String[] origin = {"참","삼","죽","허","찬"};
		
		String[] copy = origin.clone();
		
		for(int i=0;i<copy.length; i++) {
			System.out.println(copy[i]);
		}
	}
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호(-포함) :");
		String num = sc.nextLine();
		
		char[] cArr = new char[14];
		
		//cArr 배열에 num에 담긴 주민등록 번호가 들어가는 반복문.
		for(int i=0;i<14;i++) {
			cArr[i]=num.charAt(i);
		}
		char[] copy=cArr.clone();
		
		for(int i=0; i<copy.length;i++) {
			
			if(i<8) {
				copy[i]=num.charAt(i);
			}else {
				copy[i]='*';
			}
		}
			for(int i=0;i<copy.length;i++) {
				System.out.print(copy[i]);
			}
	}
}


