package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

	public void problem1() {
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[6];
		int sum = 0;
		int cnt = 0;
		
		for(int i=0;i<=5;i++) {
			System.out.println("시험 성적 6개 입력하시오 : ");
			score[i] = sc.nextInt();
			cnt++;
			sum += score[i];
		}
		Arrays.sort(score);
		System.out.println("입력한 성적의 등수는 :");
		int num = sc.nextInt();
		int grade = score.length+1;
		
		for(int i=0;i<score.length;i++) {
			if(num>=score[i]) {
				grade -= 1;
		}
		
		}
		System.out.println("입력한 성적의 등수는"+(grade)+"등 입니다.");
		
		
		System.out.println("누적 합계 : "+sum);
		System.out.println("인원수 : "+ cnt);
		System.out.println("평균 : "+ (sum/cnt));
		
	}
	public void problem2(){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();
			
			int[] num1 = new int[num]; // [][][][][][]
			
			if((num>=3)&&(num%2==1)){
				for(int i=0,j=1;i<(num1.length/2);i++,j++) {
					num1[i] = j;
					System.out.print(num1[i]);
				}
				for(int i=(num1.length/2),j=((num1.length/2)+1);i>=(num1.length/2)&&i<num1.length;i++,j--) {
					num1[i] = j;
					System.out.print(num1[i]);
				}break;
			}
			}
		
		
		
	}

	public void problem3() {
		int[][] arr = { { 5,10,15,20,25 },{ 15,20,25,30,10 },{ 20,20,20,20,20 },{ 30,30,30,30,30 }};
		int total = 0;
		double average = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
//				System.out.println(arr[i][j]);
				total += arr[i][j];
			}
		}
		average = total/(arr.length*arr[0].length);
		System.out.printf("합계는 %d점 평균은  %.2f점",total,average);
	}
}

