package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Book[] arr = new Book[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("������: ");
			String title = sc.nextLine();
			
			System.out.println("���ǻ� : ");
			String publisher = sc.nextLine();

			System.out.println("�۰��� : ");
			String author = sc.nextLine();

			System.out.println("���� : ");
			int price = sc.nextInt();
			
			System.out.println("���η� : ");
			double discountRate = sc.nextDouble();
			sc.nextLine();
			
			// �ε������� å ��ü�� �����ؼ� �Է¹��� ���� �Ű������� �ְ� �������ش�.
			arr[i] = new Book(title,publisher,author,price,discountRate);

			sc.nextLine();
			
		}
		for(int i=0;i<arr.length;i++) {
		arr[i].getTitle();
		
		}
		for(int i=0;i<arr.length;i++) {
			arr[i].showInfo();
			
			}
	}
}
