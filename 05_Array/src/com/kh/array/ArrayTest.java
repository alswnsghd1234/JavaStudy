package com.kh.array;

import java.util.Scanner;

public class ArrayTest {

	public void HomeWork() {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		
		int num = sc.nextInt();
		
		String[] day = new String[] {"월","화","수","목","금","토","일"};
		
		if((num>=0)&&(num<day.length)) {
			System.out.println(day[num]);
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		}
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("치킨 이름을 입력하세요");
		
		
		String[] menu = {"파닭","양파닭","간장","양념","후라이드"};
		
		String choice = sc.nextLine();
		String rs = "";
		
		for(int i=0;i<menu.length;i++) {
			if(choice.equals(menu[i])) {
				rs = choice+"배달가능";
				break;
			}
			else {
				rs = choice+"없는 메뉴";

			}

		}
		System.out.println(rs);
		
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		int count = str.length();
		
		// 중복을 확인하고 중복일 경우에 값을 넣지 않는다.
		
		
		String temp = "";
		//입력받은 문자열의 길이만큼 배열을 생성 할 수 있다.
		char[] cArr = new char[str.length()];
		
		String rs = "문자열에 있는 문자 :"+str.charAt(0)+",";
		
		//문자열에 어떤 문자가 들어갔는지 확인하고 그 문자를 배열에 담아서 하나하나씩 나열해서 출력
		//마지막으로 문자의 길이 반환
		for(int i=0;i<str.length();i++) {
			cArr[i] = str.charAt(i);
			
			for(int j=0;j<i;j++) {
				
				if(str.charAt(i)==cArr[j]) {
					
					count--;
					break;
				}
				else if(j==i-1&&(cArr[j]!=str.charAt(i))) {
					
					rs= rs+str.charAt(i)+",";
				}
			}
			
//			if(!(i==(cArr.length-1))) {
//				System.out.println(cArr[i]+",");
//			}else {
//			System.out.println(cArr[i]);
//		}
	}
		System.out.println("문자열의 길이 : "+rs);
		System.out.println("문자의 개수 : "+count);
}
}