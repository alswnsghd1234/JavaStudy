package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		
		//Properties : Map 계열 -> Key + Value 세트로 저장됨(단 모두 String 타입으로 설정)
		//[표현법] Properties 객체이름 = new Properties(); 제네릭 지정 X
		
		
		Properties prop = new Properties();
		
//		prop.put("오징어땅콩",new Snack("매운맛",4000));
//		prop.put("눈을감자",new Snack("짭짤맛",4000));
//		prop.put("에이스",new Snack("미지근한맛",4000));
//		
//		System.out.println(prop);
		
		/*
		 * Map 계열이기 때문에
		 * 키 + 값 세트로 저장이 되고 String형이 아니여도 잘 저장됨
		 * 그럼 왜 String으로 해야하나?
		 * Properties의 용도 -> 파일 입출력하기 위해
		 * key+value 세트들을 파일로 기록하거나 읽어오는 용도로 사용됨
		 * -> .properties 파일 확장자(자주 변경되지 않는 설정파일이나 해당프로그램이 가져야할 설정 정보들을 담는 파일)
		 * 
		 * 
		 * */
		
		prop.put("List","ArrayList");
		prop.put("Set", "LinkedHashSet");
		prop.put("Set","HashSet");
		prop.put("Map", "HashMap");
		
		//put과 같은 용도 Properties 전용
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		Properties inputProp = new Properties();
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			//store메소드 : 파일로 기록할때 쓰이는 메소드
			
			//입력
			System.out.println("입력받은 내용");
			inputProp.load(new FileInputStream("test.properties"));
			
			System.out.println(inputProp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
