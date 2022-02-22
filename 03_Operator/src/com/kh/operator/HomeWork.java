package com.kh.operator;

import java.util.Scanner;

public class HomeWork {

	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A야 놀러 갈거야? y/n");
		
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y')?("결과는 : 행복여행을 떠난다 \n a의 대답은 y, b의 대답은 y, c의 대답은 y")
				:((ch == 'n' || ch == 'N')?"결과는 : 친구B가 흐느낀다 흑흑\n a의 대답은 n, b의 대답은 y, c의 대답은 n":" ");
	
		System.out.println(result);
}
}