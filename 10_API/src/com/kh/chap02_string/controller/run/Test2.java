package com.kh.chap02_string.controller.run;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		/*
		 * �弳 ���͸� ���α׷�
		 * 
		 * ����ڿ��� ������ �ϳ� �Է¹޽��ϴ�. sc.nextLine()
		 * 
		 * ���� ���õǴ� �ܾ �ش��Ұ�� *�� ġȯ�ؼ� ����ϵ��� ���� replace()
		 * 
		 * String[] -������,�Ź߲�,�Ļ�,�����,�ֿ�,�ú�����
		 * 
		 * �̷� ������ �Ź߲����� ������� -> �̷� *** ***���� ***��
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("ä���� ġ����");
		String chat = sc.nextLine();

//		chat=chat.replace("������", "***");
//		chat=chat.replace("�Ź߲�", "***");
//		chat=chat.replace("�����", "***");

		System.out.println(chat);

		String[] filter = new String[] { "������", "�Ź߲�", "�Ļ�", "�����", "�ֿ�", "�ú�����", "�ȳ��ϼ����" };

//		chat=chat.replace(filter[0], "***");
//		chat=chat.replace(filter[1], "***");
//		chat=chat.replace(filter[3], "***");
//		
//		System.out.println(chat);

		String[] star = new String[] { "", "*", "**", "***", "****", "*****", "******" };

		for (int i = 0; i < filter.length; i++) {
			int size = filter[i].length();

//			chat=chat.replace(filter[i],star(size)); //���� ������ filter�� �ִ� �弳���̿� ���߱�
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
