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
			System.out.println("���� ���� 6�� �Է��Ͻÿ� : ");
			score[i] = sc.nextInt();
			cnt++;
			sum += score[i];
		}
		Arrays.sort(score);
		System.out.println("�Է��� ������ ����� :");
		int num = sc.nextInt();
		int grade = score.length+1;
		
		for(int i=0;i<score.length;i++) {
			if(num>=score[i]) {
				grade -= 1;
		}
		
		}
		System.out.println("�Է��� ������ �����"+(grade)+"�� �Դϴ�.");
		
		
		System.out.println("���� �հ� : "+sum);
		System.out.println("�ο��� : "+ cnt);
		System.out.println("��� : "+ (sum/cnt));
		
	}
	public void problem2(){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("������ �Է��ϼ��� : ");
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
		System.out.printf("�հ�� %d�� �����  %.2f��",total,average);
	}
}

