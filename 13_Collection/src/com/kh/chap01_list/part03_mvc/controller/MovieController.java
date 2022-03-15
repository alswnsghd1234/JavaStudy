package com.kh.chap01_list.part03_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part03_mvc.model.vo.Movie;

public class MovieController {

	private ArrayList<Movie> mv =new ArrayList<>();
	
	{//�ʱ�ȭ ��� : ��ü ������ ������ ����Ǵ� ���
		mv.add(new Movie("�ż���","220842"));
		mv.add(new Movie("���˵���","220841"));
		mv.add(new Movie("������","220843"));
		mv.add(new Movie("�ǳ�","220845"));
		
	}
	// ���ο� ��ȭ�� �߰��� ��
	public void insertMovie(String title,String openday) {
		mv.add(new Movie(title,openday));
	}
	
	//�� ��ü ��ȸ �޼ҵ�
	public ArrayList<Movie> showAll(){
		return mv;
	}
	//Ư�� �� ã�� �޼ҵ� contains ���ڿ��� �ش� ���ڰ� ���ԵǾ� �ִ��� Ȯ���ϴ� �޼ҵ�
	public ArrayList<Movie> searchMovie(String keyword){
		
		ArrayList<Movie> searched = new ArrayList<Movie>();
		
		for(int i=0;i<mv.size();i++) {
			
			if(mv.get(i).getTitle().contains(keyword)) {
				searched.add(mv.get(i));
			}
		}
		return searched;
	}
	// Ư�� ��ȭ ���� �޼ҵ�
	public void deleteMovie(String title) {
		for(int i =0;i<mv.size();i++) {
			if(mv.get(i).getTitle().contains(title)) {
				mv.remove(i);
			}
		}
	}
	//Ư���� �����ϱ�
	public void updateMovie(String title,String NewTitle,String NewOpen){
		for(int i =0;i<mv.size();i++) {
			if(mv.get(i).getTitle().contains(title)) {
				mv.get(i).setTitle(NewTitle);
				mv.get(i).setOpenday(NewOpen);
			}
	}
		
}
}
