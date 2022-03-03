package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Book[] arr = new Book[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("도서명: ");
			String title = sc.nextLine();
			
			System.out.println("출판사 : ");
			String publisher = sc.nextLine();

			System.out.println("작가명 : ");
			String author = sc.nextLine();

			System.out.println("갸격 : ");
			int price = sc.nextInt();
			
			System.out.println("할인률 : ");
			double discountRate = sc.nextDouble();
			sc.nextLine();
			
			// 인덱스마다 책 객체를 생성해서 입력받은 값을 매개변수로 넣고 생성해준다.
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
