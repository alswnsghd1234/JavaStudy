package com.kh.chap01_list.part03_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part03_mvc.model.vo.Movie;

public class MovieController {

	private ArrayList<Movie> mv =new ArrayList<>();
	
	{//초기화 블록 : 객체 생성시 무조건 수행되는 블록
		mv.add(new Movie("신세계","220842"));
		mv.add(new Movie("범죄도시","220841"));
		mv.add(new Movie("악인전","220843"));
		mv.add(new Movie("악녀","220845"));
		
	}
	// 새로운 영화가 추가될 때
	public void insertMovie(String title,String openday) {
		mv.add(new Movie(title,openday));
	}
	
	//곡 전체 조회 메소드
	public ArrayList<Movie> showAll(){
		return mv;
	}
	//특정 곡 찾기 메소드 contains 문자열에 해당 문자가 포함되어 있는지 확이하는 메소드
	public ArrayList<Movie> searchMovie(String keyword){
		
		ArrayList<Movie> searched = new ArrayList<Movie>();
		
		for(int i=0;i<mv.size();i++) {
			
			if(mv.get(i).getTitle().contains(keyword)) {
				searched.add(mv.get(i));
			}
		}
		return searched;
	}
	// 특정 영화 삭제 메소드
	public void deleteMovie(String title) {
		for(int i =0;i<mv.size();i++) {
			if(mv.get(i).getTitle().contains(title)) {
				mv.remove(i);
			}
		}
	}
	//특정곡 변경하기
	public void updateMovie(String title,String NewTitle,String NewOpen){
		for(int i =0;i<mv.size();i++) {
			if(mv.get(i).getTitle().contains(title)) {
				mv.get(i).setTitle(NewTitle);
				mv.get(i).setOpenday(NewOpen);
			}
	}
		
}
}
