package com.kh.chap02.loop;

import java.util.Scanner;

public class Test {
	
	public void Problem1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1�̻��� ���ڸ� �Է��ϼ��� :");
		int n1 = sc.nextInt();
		if(n1>0) {
			for(int n2=1;n2<=n1;n2++) {
				System.out.println(n2);
			}
			
		}
		else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}
		
	public void Problem2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1�̻��� ���ڸ� �Է��ϼ��� :");
		int n1 = sc.nextInt();
		if(n1>0) {
			for(int n2=1;n2<=n1;n2++) {
				System.out.println(n2);
			}
		}

		else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			Problem1();
		}
	}
		
	
	public void Problem3() {
	Scanner sc = new Scanner(System.in);
	System.out.println("1�̻��� ���ڸ� �Է��ϼ��� :");
	int num = sc.nextInt();
	if(num>0) {
		for(;num>0;num--) {
			System.out.println(num);
		}
		
	}
	else {
		System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
	}
	}

}
