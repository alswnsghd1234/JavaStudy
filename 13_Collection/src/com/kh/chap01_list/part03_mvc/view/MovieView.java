package com.kh.chap01_list.part03_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part03_mvc.controller.MovieController;
import com.kh.chap01_list.part03_mvc.model.vo.Movie;

public class MovieView {

	private Scanner sc = new Scanner(System.in);
	private MovieController mc = new MovieController();
	
	public void menu() {
		System.out.println("1. 새로운 곡 추가");
		System.out.println("2. 전체 곡 조회");
		System.out.println("3. 특정 곡 조회");
		System.out.println("4. 곡 삭제");
		System.out.println("5. 곡 수정");
		System.out.println("9. 프로그램 종료");
		
		System.out.println("메뉴 번호 입력: ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:insertMovie();break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 9:
		default:System.out.println("다시 입력해주세요.");
		}
}
	//1.새로운 곡을 넣는 화면
	public void insertMovie() {
		
		System.out.println("===곡 추가===");
		System.out.println("영화명 입력 : ");
		String title = sc.nextLine();
		System.out.println("오픈일 입력");
		String openday = sc.nextLine();
		sc.nextLine(); //엔터 날리기
		mc.insertMovie(title, openday);
		System.out.println("새로운 곡이 추가됏습니다");
	}
	
	public void showAll() {
		System.out.println("==전체 영화 조회==");
		System.out.println(mc.showAll());
		
		//따로 조회하고 싶다면
		ArrayList<Movie> mv = mc.showAll();
		
		//영화 목록이 비어있는지 확인하기
		if(mv.isEmpty()) {// 영화 목록이 비어있을때
			System.out.println("존재하는 영화가 없습니다.");
		}
		
		//향상된 for문으로 조회하기
		//하나씩 출력된다.
		
		for(Movie m : mv) {
			System.out.println(m);
		}
		
	}
	
	// 3번 특정곡 조회 화면
	
	public void searchMovie() {
		
		System.out.println("==영화 검색==");
		System.out.println("입력할 영화 키워드 :");
		sc.nextLine();
		
		String keyword = sc.nextLine();
		
		ArrayList<Movie> mv = mc.searchMovie(keyword);
		
		System.out.println("검색 결과:");
	}
}