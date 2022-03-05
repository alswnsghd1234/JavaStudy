package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Student;

public class Testrun {

	public static void main(String[] args) {

		Student[] arr = new Student[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("이름 입력 :");
			String name = sc.nextLine();
			System.out.println("정수 입력 :");
			int num = sc.nextInt();
			sc.nextLine();
			arr[i] = new Student(name,num);
		}
		
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i].Info());
		}
	}

}
