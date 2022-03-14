package com.kh.chap02_string.controller.run;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		/*
		 * 욕설 필터링 프로그램
		 * 
		 * 사용자에게 문장을 하나 입력받습니다. sc.nextLine()
		 * 
		 * 다음 제시되는 단어에 해당할경우 *로 치환해서 출력하도록 구현 replace()
		 * 
		 * String[] -개나리,신발끈,식빵,십장생,주옥,시베리아
		 * 
		 * 이런 개나리 신발끈같은 십장생아 -> 이런 *** ***같은 ***아
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("채팅을 치세요");
		String chat = sc.nextLine();

//		chat=chat.replace("개나리", "***");
//		chat=chat.replace("신발끈", "***");
//		chat=chat.replace("십장생", "***");

		System.out.println(chat);

		String[] filter = new String[] { "개나리", "신발끈", "식빵", "십장생", "주옥", "시베리아", "안녕하세요오" };

//		chat=chat.replace(filter[0], "***");
//		chat=chat.replace(filter[1], "***");
//		chat=chat.replace(filter[3], "***");
//		
//		System.out.println(chat);

		String[] star = new String[] { "", "*", "**", "***", "****", "*****", "******" };

		for (int i = 0; i < filter.length; i++) {
			int size = filter[i].length();

//			chat=chat.replace(filter[i],star(size)); //별의 개수와 filter에 있느 욕설길이와 맞추기
			chat = chat.replace(filter[i], star(filter[i]));
		}

		System.out.println(chat);
	}

	public static String star(int size) {

		String str = "";

		for (int i = 0; i < size; i++) {
			str += "*";
		}
		return str;
	}

	public static String star(String shit) {
		
		String first = shit.substring(0, 1);
		int size = shit.length() - 1;

		String str = first;

		for (int i = 0; i < size; i++) {
			first += "*";
		}
		return first;
	}

}
