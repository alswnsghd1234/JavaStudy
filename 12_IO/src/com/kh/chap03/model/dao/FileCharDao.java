package com.kh.chap03.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	//���α׷� ->�ܺθ�ü (����)
	//���
	
	public void fileSave() {
		
		//FileWriter : ���Ϸ� �����͸� 2byte ������ ����ϴ� ��Ʈ��
		
		FileWriter fw=null; //finally�������� ����ϱ����� 
		
		try {
			fw = new FileWriter("b_char.txt",true); //��ü���� ->���ϰ� ����� ��θ� ����ڴ�.
			
			//���Ͽ� ���� ->write()
			fw.write("���� ������ �ʹ� ����� ��е� �����");
			
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
	
	//���α׷� <--�ܺθ�ü (����)
	//�Է�
	public void fileRead() {
		
		//FileReader : ���Ϸκ��� �����͸� 2byte�� �Է¹޴� ��Ʈ�� 
		
		FileReader fr = null;
		
		try {
			fr=new FileReader("b_char.txt"); //��ü���� - ������θ� ����ڴ�.�����ϴ� ���ϸ����θ� ����
			
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
