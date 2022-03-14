package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
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
		FileOutputStream fout=null;
		//try문안에서 만들면 finally에서 사용불가 (지역변수)
		
		try {
			fout=new FileOutputStream("a_byte.txt",true);
			//true 작성시 : 기존에 파일이 있으면 이어서 작성됨 
			//false 작성시 : 기존에 파일이 있을 경우 덮어씌워짐(false가 기본옵션)
			
			
//		2.연결한 통로로 데이터를 전송
//		write() 메소드로 작성
//		1byte 범위의 숫자를 출력 가능 (음수 불가)
//		단 파일에 기록되기를 해당 숫자의 고유한 문자가 기록됨(아스키코드)
//		0~127
//		데이터 출력
		fout.write(81);
		fout.write(66);
		fout.write(100);
		
		byte[] arr= {97,112,112,108,101}; //apple 인터넷에 아스키코드표 검색후 해당하는 숫자 넣기.
		
		
		fout.write(arr);
		
		fout.write(arr,1,3); //arr배열로부터 1번인덱스에서 3개만 쓸때
		
		fout.write('A');
		fout.write('b');
		//한글은 2byte이기때문에 깨져서 입력됨. 바이트스트림으로는 불가 -> 문자스트림 사용.
		fout.write('김');
		fout.write('사');
		
		//3.스트림을 다 쓰면 자원을 반납해야한다 반드시
//		fout.close(); 중간에 예외발생시 자원반납이 안된다.
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//어떤 예외가 발생하던지 실행되는 구문 
				 //반드시 실행 해야하는 구문을 적어준다 
			
			try {
				fout.close(); //예외처리 해줘야함
				//자원반납 (통로 닫기)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	//파일->프로그램
	//입력 받아오기 (파일로부터 데이터를 가지고 옴)
	
	public void method2() {
		
		//FileInputStream : 파일로부터 데이터를 입력받는데 1byte씩 가져오겠다.
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("a_byte.txt");//반드시 존재하는 파일로 적어줘야함
			
			//read() 메소드로 데이터 읽어오기
			//1byte씩 읽어온다
			
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			//파일의 끝을 만나는 순간 read()메소드를 호출하면 -1을 반환한다.
//			int value =0;
//			while((value=fis.read())!=-1) { //fis.read()를 하는 순간 값을 꺼내오기 때문에 꺼내고 사라짐 
//				System.out.println(value);  //사라지기전에 변수에 담아서 출력하기 
//			}
//			fis.read(); //int형을 반환만 하고 끝 
			while(fis.read()!=-1) { //a  c e g
				System.out.println(fis.read()); // b  d f -1
			}
		}	 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	public void method3() {
		
		//객체를 생성한다. FileOutStream 을 이용하여 참조 변수 객체 생성
		//FileOutStream 은 외부로 내보내겠다 byte 크기로
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("About.txt",true); // txt파일 생성
			//true 작성시 기존 파일에 이어서 작성
			//false 작성 시  기존 파일에 덮어쓰기
			
			fos.write('d');
			fos.write('c');
			fos.write(33);
			
			byte[] bb = {23,45,12,33,112};
			fos.write(bb);
			fos.write(bb, 1, 2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}// 다 실행시 닫기 필수
			catch(IOException e){
				e.printStackTrace();
			} //에러시 에러구문 찾기
		}
		
	}
	
	public void method4() {
		
		FileInputStream fis = null;
		 
		try {
			int value = 0;
			fis = new FileInputStream("a_byte.txt");
			
			while((value=fis.read()) != -1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			fis.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	}
}
