package com.kh.chap03.branch;

import java.io.InputStream;
import java.util.Scanner;

public class B_Continue {

	public void method1() {
		
		// 1���� 10���� Ȧ���� ���
		// 1 3 5 7 9
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				continue;
			}
			//¦���� ���� ������� �ʰڴ�.
			System.out.println(i);
		}
	}
	public void method2() {
		//1���� 100���� �� �հ�
		//6�� ������� ���� ���غ��ô�. -> 6���� �������� �������� 0�� ���
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
		//�������� ����غ��ô�
		//�� 4�� ��� �ܸ� ���� ����սô�.
		//4�� ����� 4�� ���� ������ ���� 0�� ���
		
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
		System.out.println("���� ���� : ");
		int start = sc.nextInt();
		System.out.println("���� : ");
		int abst = sc.nextInt();
		
		
		for(int j=start;j<=start+abst*9;j+=abst) {
			System.out.println(j);
		}
		
		}

	
	public void method5() {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� ���� : ");
//		int start = sc.nextInt();
//		System.out.println("���� : ");
//		int abst = sc.nextInt();
		
		int count = 1;
		long num = 1;
		long sum = 0;
		
		while(count<=40) {
			sum += num;
			System.out.println(count+"������ �޴� �� :"+num);
			num *= 2;
		
			count++;
			
		}
		System.out.println(sum);
		
		
	}
	}

