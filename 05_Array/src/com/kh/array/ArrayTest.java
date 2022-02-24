package com.kh.array;

import java.util.Scanner;

public class ArrayTest {

	public void HomeWork() {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		
		int num = sc.nextInt();
		
		String[] day = new String[] {"월","화","수","목","금","토","일"};
		
		if((num>0)&&(num<day.length)) {
			System.out.println(day[num]);
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		
		}
}
