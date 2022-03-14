package com.kh.cha04_assist_part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//BufferedReader / BufferedWriter
	/*
	 * -버퍼공간을 제공해서 한번에 모아뒀다가 한꺼번에 입출력 진행
	 * ->속도향상 목적의 보조스트림(BufferedXXX)
	 * [표현법]
	 * 보조스트림클래스이름 객체이름 = new 보조스트림클래스이름(기반스트림객체);
	 * -보조스트림은 단독으로 존재할 수 없기 때문에.
	 * 
	 */
	
	//프로그램 ->외부매체 (file)
	//출력
	public void fileSave() {
		//BufferedWriter : 버퍼공간을 제공해서 한꺼번에 출력하겠다.
		//기반스트림이 Input/Output 계열일 경우 보조스트림도 Input/Output 계열
		//기반스트림이 Reader/Writer 계열일 경우 보조스트림도 Reader/Wrtier 계열
		FileWriter fw = null;
		
		BufferedWriter bw = null;
		
		
		try {
			fw=new FileWriter("a_buffered.txt"); //기반스트림 객체 생성
		 
			bw=new BufferedWriter(fw); //보조스트림은 단독생성이 불가능 (기반스트림을 뿌리로 둔다)
			
			bw.write("안녕하세요");
			bw.write("반갑습니다\n");
			bw.write("저는 스무살이에요");
			bw.newLine();//개행메소드
			bw.write("응애");
			bw.flush(); //버퍼 비우기
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				bw.close();
				fw.close(); //자원반납시엔 생성된 자원 역순으로 반납.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	//bufferedreader 사용해보기 
	public void fileRead() {
		
		//1.기반스트림 생성
		//2.보조스트림에 기반스트림 객체 추가하여 생성
		//3.읽기
		//4.자원반납 
		FileReader fr =null;
		BufferedReader br = null;
		
		try {
			fr=new FileReader("a_buffered.txt");
			br=new BufferedReader(fr);
	        //읽어오기 read();
			
			//read로 읽어오기 1개씩
//			int value=0;
//			while((value=br.read())!=-1){
//				System.out.println((char)value);
//			}
			
//			readLine으로 한줄씩 읽어오기 (문자열로 반환됨)
			String value=null;
			while((value=br.readLine())!=null){
				System.out.println(value);
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close(); //역순으로 닫기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	//try with resource 구문
	//자동으로 자원 반납해주는 구문
	//jdk 1.7이상부터 사용 가능한 구문입니다.
	
	/*
	 * [표현법]
	 * try(스트림 객체생성;){
	 * 예외구문발생
	 * }catch(예외클래스이름 변수) {
	 * 	예외처리구문
	 * }
	 * 
	 * 스트림 객체를 생성하고 해당 블록이 실행완료되면 자원 반납이 자동으로 이루어진다.
	 * 
	 * 
	 * */
//	try(FileReader fr=new FileReader("a_buffered.txt");BufferedReader br = new BufferedReader(fr)){
//		
//	}catch(Exception e) {
//		System.out.println("잡았다 요놈");
//	}
	//기반 스트림과 보조스트림 생성구문을 하나로 합치기
	try(BufferedReader br =new BufferedReader(new FileReader("a_buffered.txt"))){
		
	}
	
	
}
}
