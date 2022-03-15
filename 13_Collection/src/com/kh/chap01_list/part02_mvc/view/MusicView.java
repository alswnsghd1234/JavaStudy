package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;


import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void menu() {
		// �߰�, ��ü ��ȸ, Ư������ȸ,����,����
		
		while(true) {
		System.out.println("1. ���ο� �� �߰�");
		System.out.println("2. ��ü �� ��ȸ");
		System.out.println("3. Ư�� �� ��ȸ");
		System.out.println("4. �� ����");
		System.out.println("5. �� ����");
		System.out.println("9. ���α׷� ����");
		
		System.out.println("�޴� ��ȣ �Է�: ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:insertMusic();break;
		case 2:showAll();break;
		case 3:searchMusic();break;
		case 4:deleteMusic();break;
		case 5:updateMusic();break;
		case 9:System.out.println("���α׷� ����");return;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		
		}
		}
	}
	//1. ���ο� ���� �ִ� ȭ��
	public void insertMusic() {
		
		System.out.println("===�� �߰�=====");
		System.out.println("��� �Է� : ");
		String title = sc.nextLine();
		System.out.println("������ �Է�");
		String artist = sc.nextLine();
		sc.nextLine(); //���� ������
		
		mc.insertMusic(title,artist);
		
		
		System.out.println("���ο� ���� �߰��ѽ��ϴ�");
	}
	
	// 2. ��ü ���� ��ȸ�ϴ� ȭ��
	public void showAll() {
		System.out.println("===��ü �� ��ȸ=====");
		System.out.println(mc.showAll()); // ����Ʈ ���·� ����ϱ�
		
		//���� �̰�ʹٸ�
		ArrayList<Music> list = mc.showAll();
		
		//�뷡����� ����ִ��� Ȯ���ϱ�
		
		if(list.isEmpty()) { // �뷡 ����� ���������
			System.out.println("�����ϴ� ���� �����ϴ�.");
		}
		
		//���� for������ ��ȸ�ϱ�
		//�Ѱ ��µȴ�.
		for(Music m : list) {
			System.out.println(m);
		}
	}
	
	// 3�� Ư���� ��ȸ ȭ��
	
	public void searchMusic() {
		
		System.out.println("====�� �˻�====");
		System.out.println("�Է��� �� Ű���� : ");
		sc.nextLine();
		String keyword=sc.nextLine();
		
		ArrayList<Music> list = mc.searchMusic(keyword); //searched list�� �ּҰ� ��ܿ�
		
		System.out.println("�˻� ��� :");
		
		if(list.isEmpty()) {
			System.out.println("��ȸ�� ����� �����ϴ�.");
		}else {
			
			for(Music m :list) {
				System.out.println(m);
			}
		}
	}
	
	//4�� �� ����ȭ��
	public void deleteMusic() {
		
		System.out.println("===�� ����===");
		System.out.println("���� �� ��� �Է�: ");
		sc.nextLine();
		String title = sc.nextLine();
		
		mc.deleteMusic(title);
	}
	
	//5. �� ���� ȭ��
	public void updateMusic() {
		
		System.out.println("==�� ����==");
		System.out.println("�ٲ� �� �Է�:");
		String title = sc.nextLine();
		System.out.println("���� �� �� �Է�:");
		String newTitle = sc.nextLine();
		System.out.println("���� �� ��Ƽ��Ʈ �Է�:");
		String newArtist = sc.nextLine();
		
		mc.updateMusic(title, newTitle, newArtist);
		
	}
	

}
