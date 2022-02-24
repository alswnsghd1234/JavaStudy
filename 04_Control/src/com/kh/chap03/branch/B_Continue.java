package com.kh.chap03.branch;

import java.io.InputStream;
import java.util.Scanner;

public class B_Continue {

	public void method1() {
		
		// 1부터 10까지 홀수만 출력
		// 1 3 5 7 9
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				continue;
			}
			//짝수일 때는 출력하지 않겠다.
			System.out.println(i);
		}
	}
	public void method2() {
		//1부터 100까지 총 합계
		//6의 배수값만 빼고 더해봅시다. -> 6으로 나눴을때 나머지가 0인 경우
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%6==0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	public void method3() {
		//구구단을 출력해봅시다
		//단 4의 배수 단만 빼고 출력합시다.
		//4의 배수는 4로 나눈 나머지 값이 0인 경우
		
		for(int i=2;i<10;i++) {
			if(i==4&&i==8) {
				continue;
			}
			for(int j=1;j<=9;j++) {
				
				System.out.println(i+"*"+j+"="+i*j);
				
			}
		}
	}
	public void method4() {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.println("공차 : ");
		int abst = sc.nextInt();
		
		
		for(int j=start;j<=start+abst*9;j+=abst) {
			System.out.println(j);
		}
		
		}

	
	public void method5() {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시작 숫자 : ");
//		int start = sc.nextInt();
//		System.out.println("공비 : ");
//		int abst = sc.nextInt();
		
		int count = 1;
		long num = 1;
		long sum = 0;
		
		while(count<=40) {
			sum += num;
			System.out.println(count+"일차에 받는 돈 :"+num);
			num *= 2;
		
			count++;
			
		}
		System.out.println(sum);
		
		
	}
	}

