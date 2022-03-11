package com.kh.chap02_byte.model.duo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO (Data Access Object) : 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 입출력하는 메소드들을 
//							 모아둔 클래스 model.dao 패키지에 모아서 사용 
public class FileByteDao {
	
	//바이트 스트림 실습
	
	//프로그램 ->외부(파일)
	//출력 : 프로그램 내의 데이터를 파일로 내보내기 (즉,파일로 기록하겠다) 
	
	//FileOutputStream : "파일"로 출력하는데 1byte 단위로 하겠다.
	public void method1() {
		
//		1.FileOutputStream 객체 생성
//		해당 파일과 직접 연결하는 통로를 생성
//		해당 파일이 존재하지 않으면 파일을 생성하면서 연결된다.
//		해당파일이 존재하는경우 : 그냥 통로만 연결
		FileOutputStream fout = null ;
		try {
			fout=new FileOutputStream("a_byte.txt");
			
//		2.연결한 통로로 데이터를 전송
//		write() 메소드로 작성
//		1byte 범위의 숫자를 출력 가능 (음수 불가)
//		단 파일에 기록되기를 해당 숫자의 고유한 문자가 기록됨(아스키코드)
//		0~127
//		데이터 출력
		fout.write(65);
		fout.write(66);
		fout.write(100);
		
		byte[] arr = {97,112,112,108,101}; // apple 
		
		fout.write(arr);
		fout.write(arr,1,3);
		// 한글은 2btye 이기 때문에 깨져서 입력됨. 바이트스트림으로는 불가 -> 문자 스트림 사용
		fout.write('김');
		fout.write('사');
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		finally {//어떤 예외가 발생하던지 실행되는 구문
			//반드시 실행 해야하는구문을 적어준다
			try {
				fout.close();
				//자원반납/통로닫기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	

}
