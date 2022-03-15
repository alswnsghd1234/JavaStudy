package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {
	
	// 필드부
	// 음악 리스트 생성
	
	private ArrayList<Music> list = new ArrayList<>();
	
	{//초기화 블록 : 객체 생성시 무조건 수행되는 블록
		list.add(new Music("나는나비","YB"));
		list.add(new Music("봄날","BTS"));
		list.add(new Music("one love","엠씨더맥스"));
		list.add(new Music("니가보고싶은밤","윤딴딴"));
	}
	
	//새로운 곡 추가 요청이 있을때 실행되는 메소드
	
	public void AddSing(String title,String artist) {
		list.add(new Music(title,artist));
	}

	//곡 전체 조회 메소드
	public ArrayList<Music> showAll(){
		return list;
	}
	//특정 곡 찾기 메소드 contains 문자열에 해당문자가 포함되어있는지 확인하는 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		
		//list.get(0).getTitle() 제목을 반환 String
		//list.get(0).getTitle().contains(keyword); 0번째 인덱스에 있는 객체의 제목과 키워드를 비교
		ArrayList<Music> searched = new ArrayList<>();
		
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getTitle().contains(keyword)) {
				//제목이 keword가 포함되어있는지 묻는구문
				//찾았으면 새로만든 검색된 리스트에다 추가해주면 됨
				searched.add(list.get(i));
			}
			
		}
		return searched;
		}
	
	//특정 곡 삭제 메소드
	
	public void deleteMusic(String title) {
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getTitle().equals(title)) { //list의 i번째 인덱스에 있는 제목
				//즉 내가 삭제할 제목과 list에 i번째에 담겨있는 제목이 같아서 삭제할 노래일때..
				list.remove(i);
			}
		}
	}
	public void updateMusic(String title,String newTitle, String newArtist) {
		
		//list의 set 이용하기
//		list.set(0, new Music(newTitle,newArtist));
		
		//getter, setter 사용하기
		
		for(int i=0;i<list.size();i++) {
			
			//list의 i번째 있는 Music의 제목이 입력받은 제목과 일치할 때
			if(list.get(i).getTitle().equals(title)) {
				
				list.get(0).setTitle(newTitle); //제목 수정
				list.get(0).setArtist(newArtist); // 가수 수정
			}
		}
		
	}

	public void insertMusic(String title, String artist) {
		list.add(new Music(title,artist));
	}
}
