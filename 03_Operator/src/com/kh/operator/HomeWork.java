package com.kh.operator;

import java.util.Scanner;

public class HomeWork {

	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.println("A�� � ���ž�? y/n");
		
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y')?("����� : �ູ������ ������ \n a�� ����� y, b�� ����� y, c�� ����� y")
				:((ch == 'n' || ch == 'N')?"����� : ģ��B�� ������� ����\n a�� ����� n, b�� ����� y, c�� ����� n":" ");
	
		System.out.println(result);
}
}