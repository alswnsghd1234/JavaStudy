package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		
		//Properties : Map �迭 -> Key + Value ��Ʈ�� �����(�� ��� String Ÿ������ ����)
		//[ǥ����] Properties ��ü�̸� = new Properties(); ���׸� ���� X
		
		
		Properties prop = new Properties();
		
//		prop.put("��¡���",new Snack("�ſ��",4000));
//		prop.put("��������",new Snack("¬©��",4000));
//		prop.put("���̽�",new Snack("�������Ѹ�",4000));
//		
//		System.out.println(prop);
		
		/*
		 * Map �迭�̱� ������
		 * Ű + �� ��Ʈ�� ������ �ǰ� String���� �ƴϿ��� �� �����
		 * �׷� �� String���� �ؾ��ϳ�?
		 * Properties�� �뵵 -> ���� ������ϱ� ����
		 * key+value ��Ʈ���� ���Ϸ� ����ϰų� �о���� �뵵�� ����
		 * -> .properties ���� Ȯ����(���� ������� �ʴ� ���������̳� �ش����α׷��� �������� ���� �������� ��� ����)
		 * 
		 * 
		 * */
		
		prop.put("List","ArrayList");
		prop.put("Set", "LinkedHashSet");
		prop.put("Set","HashSet");
		prop.put("Map", "HashMap");
		
		//put�� ���� �뵵 Properties ����
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		Properties inputProp = new Properties();
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			//store�޼ҵ� : ���Ϸ� ����Ҷ� ���̴� �޼ҵ�
			
			//�Է�
			System.out.println("�Է¹��� ����");
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
