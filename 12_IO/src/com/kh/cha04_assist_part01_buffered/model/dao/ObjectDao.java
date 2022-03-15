package com.kh.cha04_assist_part01_buffered.model.dao;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.assist_chap02_object.model.vo.Phone;

public class ObjectDao {

	//프로글매 -> 외부매체(파일)
	//출력
	
	public void saveFile(String fileName) {
		
		Phone ph = new Phone("아이폰",138000);
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		
//		fos = new FileOutputStream(fileName);
//		oos = new ObjectOutputStream(fos);
		
//		try(FileOutputStream fos = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream){
//			
//		}
//		
		//한방에 같이 쓰기
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			// 보조스트림에 기반 스트림 객체 넣어서 생성완료
			
			oos.writeObject(ph); // writeObject로 폰객체 보내기
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//readObject 사용 읽어오는 메소드
	public void readFile(String fileName) {
		try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(fileName))){
		
			Object value;
			value = oos.readObject();
			
			System.out.println(value); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
