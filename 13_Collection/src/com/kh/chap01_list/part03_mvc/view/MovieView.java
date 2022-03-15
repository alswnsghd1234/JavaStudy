package com.kh.chap01_list.part03_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part03_mvc.controller.MovieController;
import com.kh.chap01_list.part03_mvc.model.vo.Movie;

public class MovieView {

	private Scanner sc = new Scanner(System.in);
	private MovieController mc = new MovieController();
	
	public void menu() {
		System.out.println("1. ���ο� �� �߰�");
		System.out.println("2. ��ü �� ��ȸ");
		System.out.println("3. Ư�� �� ��ȸ");
		System.out.println("4. �� ����");
		System.out.println("5. �� ����");
		System.out.println("9. ���α׷� ����");
		
		System.out.println("�޴� ��ȣ �Է�: ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:insertMovie();break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 9:
		default:System.out.println("�ٽ� �Է����ּ���.");
		}
}
	//1.���ο� ���� �ִ� ȭ��
	public void insertMovie() {
		
		System.out.println("===�� �߰�===");
		System.out.println("��ȭ�� �Է� : ");
		String title = sc.nextLine();
		System.out.println("������ �Է�");
		String openday = sc.nextLine();
		sc.nextLine(); //���� ������
		mc.insertMovie(title, openday);
		System.out.println("���ο� ���� �߰��ѽ��ϴ�");
	}
	
	public void showAll() {
		System.out.println("==��ü ��ȭ ��ȸ==");
		System.out.println(mc.showAll());
		
		//���� ��ȸ�ϰ� �ʹٸ�
		ArrayList<Movie> mv = mc.showAll();
		
		//��ȭ ����� ����ִ��� Ȯ���ϱ�
		if(mv.isEmpty()) {// ��ȭ ����� ���������
			System.out.println("�����ϴ� ��ȭ�� �����ϴ�.");
		}
		
		//���� for������ ��ȸ�ϱ�
		//�ϳ��� ��µȴ�.
		
		for(Movie m : mv) {
			System.out.println(m);
		}
		
	}
	
	// 3�� Ư���� ��ȸ ȭ��
	
	public void searchMovie() {
		
		System.out.println("==��ȭ �˻�==");
		System.out.println("�Է��� ��ȭ Ű���� :");
		sc.nextLine();
		
		String keyword = sc.nextLine();
		
		ArrayList<Movie> mv = mc.searchMovie(keyword);
		
		System.out.println("�˻� ���:");
	}
}