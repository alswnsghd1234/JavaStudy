package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {
	
	// �ʵ��
	// ���� ����Ʈ ����
	
	private ArrayList<Music> list = new ArrayList<>();
	
	{//�ʱ�ȭ ��� : ��ü ������ ������ ����Ǵ� ���
		list.add(new Music("���³���","YB"));
		list.add(new Music("����","BTS"));
		list.add(new Music("one love","�������ƽ�"));
		list.add(new Music("�ϰ����������","������"));
	}
	
	//���ο� �� �߰� ��û�� ������ ����Ǵ� �޼ҵ�
	
	public void AddSing(String title,String artist) {
		list.add(new Music(title,artist));
	}

	//�� ��ü ��ȸ �޼ҵ�
	public ArrayList<Music> showAll(){
		return list;
	}
	//Ư�� �� ã�� �޼ҵ� contains ���ڿ��� �ش繮�ڰ� ���ԵǾ��ִ��� Ȯ���ϴ� �޼ҵ�
	public ArrayList<Music> searchMusic(String keyword) {
		
		//list.get(0).getTitle() ������ ��ȯ String
		//list.get(0).getTitle().contains(keyword); 0��° �ε����� �ִ� ��ü�� ����� Ű���带 ��
		ArrayList<Music> searched = new ArrayList<>();
		
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getTitle().contains(keyword)) {
				//������ keword�� ���ԵǾ��ִ��� ���±���
				//ã������ ���θ��� �˻��� ����Ʈ���� �߰����ָ� ��
				searched.add(list.get(i));
			}
			
		}
		return searched;
		}
	
	//Ư�� �� ���� �޼ҵ�
	
	public void deleteMusic(String title) {
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getTitle().equals(title)) { //list�� i��° �ε����� �ִ� ����
				//�� ���� ������ ����� list�� i��°�� ����ִ� ������ ���Ƽ� ������ �뷡�϶�..
				list.remove(i);
			}
		}
	}
	public void updateMusic(String title,String newTitle, String newArtist) {
		
		//list�� set �̿��ϱ�
//		list.set(0, new Music(newTitle,newArtist));
		
		//getter, setter ����ϱ�
		
		for(int i=0;i<list.size();i++) {
			
			//list�� i��° �ִ� Music�� ������ �Է¹��� ����� ��ġ�� ��
			if(list.get(i).getTitle().equals(title)) {
				
				list.get(0).setTitle(newTitle); //���� ����
				list.get(0).setArtist(newArtist); // ���� ����
			}
		}
		
	}

	public void insertMusic(String title, String artist) {
		list.add(new Music(title,artist));
	}
}
