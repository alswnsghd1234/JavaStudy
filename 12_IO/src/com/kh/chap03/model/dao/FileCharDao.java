package com.kh.chap03.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	//프로그램 ->외부매체 (파일)
	//출력
	
	public void fileSave() {
		
		//FileWriter : 파일로 데이터를 2byte 단위로 출력하는 스트림
		
		FileWriter fw=null; //finally구문에서 사용하기위해 
		
		try {
			fw = new FileWriter("b_char.txt",true); //객체생성 ->파일과 연결된 통로를 만들겠다.
			
			//파일에 쓰기 ->write()
			fw.write("오늘 날씨가 너무 흐려서 기분도 흐려요");
			
			fw.write('A');
			
			char[] cbuf = {'a','p','p','l','e'};
			
			fw.write(cbuf);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	//프로그램 <--외부매체 (파일)
	//입력
	public void fileRead() {
		
		//FileReader : 파일로부터 데이터를 2byte씩 입력받는 스트림 
		
		FileReader fr = null;
		
		try {
			fr=new FileReader("b_char.txt"); //객체생성 - 연결통로를 만들겠다.존재하는 파일명으로만 제시
			
			int value=0;
			
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
			
//			while(true) {
//				int value=fr.read();
//				if(value==-1) {
//					break;
//				}
//				System.out.println(value);
//			}


			
		
		
		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	

}
