package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;


import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void menu() {
		// 추가, 전체 조회, 특정곡조회,삭제,수정
		
		while(true) {
		System.out.println("1. 새로운 곡 추가");
		System.out.println("2. 전체 곡 조회");
		System.out.println("3. 특정 곡 조회");
		System.out.println("4. 곡 삭제");
		System.out.println("5. 곡 수정");
		System.out.println("9. 프로그램 종료");
		
		System.out.println("메뉴 번호 입력: ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:insertMusic();break;
		case 2:showAll();break;
		case 3:searchMusic();break;
		case 4:deleteMusic();break;
		case 5:updateMusic();break;
		case 9:System.out.println("프로그램 종료");return;
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		
		}
		}
	}
	//1. 새로운 곡을 넣는 화면
	public void insertMusic() {
		
		System.out.println("===곡 추가=====");
		System.out.println("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.println("가수명 입력");
		String artist = sc.nextLine();
		sc.nextLine(); //엔터 날리기
		
		mc.insertMusic(title,artist);
		
		
		System.out.println("새로운 곡이 추가됏습니다");
	}
	
	// 2. 전체 곡을 조회하는 화면
	public void showAll() {
		System.out.println("===전체 곡 조회=====");
		System.out.println(mc.showAll()); // 리스트 형태로 출력하기
		
		//따로 뽑고싶다면
		ArrayList<Music> list = mc.showAll();
		
		//노래목록이 비어있는지 확인하기
		
		if(list.isEmpty()) { // 노래 목록이 비어있을때
			System.out.println("존재하는 곡이 없습니다.");
		}
		
		//향상된 for문으로 조회하기
		//한곡씩 출력된다.
		for(Music m : list) {
			System.out.println(m);
		}
	}
	
	// 3번 특정곡 조회 화면
	
	public void searchMusic() {
		
		System.out.println("====곡 검색====");
		System.out.println("입력할 곡 키워드 : ");
		sc.nextLine();
		String keyword=sc.nextLine();
		
		ArrayList<Music> list = mc.searchMusic(keyword); //searched list의 주소가 담겨옴
		
		System.out.println("검색 결과 :");
		
		if(list.isEmpty()) {
			System.out.println("조회된 결과가 없습니다.");
		}else {
			
			for(Music m :list) {
				System.out.println(m);
			}
		}
	}
	
	//4번 곡 삭제화면
	public void deleteMusic() {
		
		System.out.println("===곡 삭제===");
		System.out.println("삭제 할 곡명 입력: ");
		sc.nextLine();
		String title = sc.nextLine();
		
		mc.deleteMusic(title);
	}
	
	//5. 곡 수정 화면
	public void updateMusic() {
		
		System.out.println("==곡 업뎃==");
		System.out.println("바꿀 곡 입력:");
		String title = sc.nextLine();
		System.out.println("변경 할 곡 입력:");
		String newTitle = sc.nextLine();
		System.out.println("변경 할 아티스트 입력:");
		String newArtist = sc.nextLine();
		
		mc.updateMusic(title, newTitle, newArtist);
		
	}
	

}
