package com.kh.chap01_file;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args){
		
		//간단하게 파일을 만드는 과정
		//File 클래스를 가지고 작업
		//java.io 패키지
		
		//파일 클래스에서 객체 생성
		File file1 = new File("test.txt");//File객체 생성 별도의 경로지정하지 않고 파일명만 적어서 생성하면
										  //현재 프로젝트 폴더에 생성됨
		
			try {
				file1.createNewFile();
			
		//2.경로지정을 한 파일명을 제시해서 생성 ->실제 존재하는 경로를 제시해야함 \\두개 입력해야 \로 인식함
			File file2 = new File("D:\\moon\\test.txt");
				file2.createNewFile();
		//3.폴더를 생성하고나서 그 안에 파일을 생성
			File testFolder = new File("D:\\test");
			testFolder.mkdir(); //make directory
			
			File file3 = new File("D:\\test\\hi.txt");
			file3.createNewFile();
			
		//4.별도의 경로지정없이 폴더 생성후 파일생성 ->현재 이 프로젝트에 폴더가 생성된다.
			File testFolder2 = new File("hoo");
			testFolder2.mkdir();
			
			File file4 = new File("hoo\\hoho.txt");
			file4.createNewFile();
			
			//File 클래스에서 제공하는 메소드들
			
			System.out.println("file1은 파일인가요 ? "+file1.isFile());//파일이면 true/폴더면 false를 반환
			System.out.println("testFolder2는 파일인가요 ? "+testFolder2.isFile());//폴더니까 false
			
			System.out.println("파일이름 : "+file1.getName()); //파일명만 추출해서 반환
			System.out.println("상위폴더 : "+file1.getParent()); //상위 폴더명만 추출해서 반환
			System.out.println("파일용량 : "+file1.length());//파일 크기 반환
			System.out.println("절대경로 : "+file1.getAbsolutePath());//시작점에서부터 풀경로.
			
			} 
			
			catch (IOException e) {
				e.printStackTrace();
			}
	}

}
