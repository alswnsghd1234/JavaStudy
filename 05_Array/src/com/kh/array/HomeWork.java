package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

	public void problem1() {
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[6];
		int sum = 0;
		int cnt = 0;
		int count = 1;
		int result[] = new int[6];
		
		for(int i=0;i<=5;i++) {
			System.out.println("���� ���� 6�� �Է��Ͻÿ� : ");
			score[i] = sc.nextInt();
			for(int j=0;j<=5;j++) {
				if(score[i]<score[j]) {
					count++;
				}
				result[i] =count;
			}
			cnt++;
			sum += score[i];
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]+"="+i);
		}
		System.out.println("���� �հ� : "+sum);
		System.out.println("�ο��� : "+ cnt);
		System.out.println("��� : "+ (sum/cnt));
		
		
		
		
	}
}
