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

	//���α۸� -> �ܺθ�ü(����)
	//���
	
	public void saveFile(String fileName) {
		
		Phone ph = new Phone("������",138000);
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		
//		fos = new FileOutputStream(fileName);
//		oos = new ObjectOutputStream(fos);
		
//		try(FileOutputStream fos = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream){
//			
//		}
//		
		//�ѹ濡 ���� ����
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			// ������Ʈ���� ��� ��Ʈ�� ��ü �־ �����Ϸ�
			
			oos.writeObject(ph); // writeObject�� ����ü ������
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//readObject ��� �о���� �޼ҵ�
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
