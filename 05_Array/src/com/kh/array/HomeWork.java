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
			System.out.println("시험 성적 6개 입력하시오 : ");
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
		System.out.println("누적 합계 : "+sum);
		System.out.println("인원수 : "+ cnt);
		System.out.println("평균 : "+ (sum/cnt));
		
		
		
		
	}
}
