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
	 * -���۰����� �����ؼ� �ѹ��� ��Ƶ״ٰ� �Ѳ����� ����� ����
	 * ->�ӵ���� ������ ������Ʈ��(BufferedXXX)
	 * [ǥ����]
	 * ������Ʈ��Ŭ�����̸� ��ü�̸� = new ������Ʈ��Ŭ�����̸�(��ݽ�Ʈ����ü);
	 * -������Ʈ���� �ܵ����� ������ �� ���� ������.
	 * 
	 */
	
	//���α׷� ->�ܺθ�ü (file)
	//���
	public void fileSave() {
		//BufferedWriter : ���۰����� �����ؼ� �Ѳ����� ����ϰڴ�.
		//��ݽ�Ʈ���� Input/Output �迭�� ��� ������Ʈ���� Input/Output �迭
		//��ݽ�Ʈ���� Reader/Writer �迭�� ��� ������Ʈ���� Reader/Wrtier �迭
		FileWriter fw = null;
		
		BufferedWriter bw = null;
		
		
		try {
			fw=new FileWriter("a_buffered.txt"); //��ݽ�Ʈ�� ��ü ����
		 
			bw=new BufferedWriter(fw); //������Ʈ���� �ܵ������� �Ұ��� (��ݽ�Ʈ���� �Ѹ��� �д�)
			
			bw.write("�ȳ��ϼ���");
			bw.write("�ݰ����ϴ�\n");
			bw.write("���� �������̿���");
			bw.newLine();//����޼ҵ�
			bw.write("����");
			bw.flush(); //���� ����
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				bw.close();
				fw.close(); //�ڿ��ݳ��ÿ� ������ �ڿ� �������� �ݳ�.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	//bufferedreader ����غ��� 
	public void fileRead() {
		
		//1.��ݽ�Ʈ�� ����
		//2.������Ʈ���� ��ݽ�Ʈ�� ��ü �߰��Ͽ� ����
		//3.�б�
		//4.�ڿ��ݳ� 
		FileReader fr =null;
		BufferedReader br = null;
		
		try {
			fr=new FileReader("a_buffered.txt");
			br=new BufferedReader(fr);
	        //�о���� read();
			
			//read�� �о���� 1����
//			int value=0;
//			while((value=br.read())!=-1){
//				System.out.println((char)value);
//			}
			
//			readLine���� ���پ� �о���� (���ڿ��� ��ȯ��)
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
				fr.close(); //�������� �ݱ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	//try with resource ����
	//�ڵ����� �ڿ� �ݳ����ִ� ����
	//jdk 1.7�̻���� ��� ������ �����Դϴ�.
	
	/*
	 * [ǥ����]
	 * try(��Ʈ�� ��ü����;){
	 * ���ܱ����߻�
	 * }catch(����Ŭ�����̸� ����) {
	 * 	����ó������
	 * }
	 * 
	 * ��Ʈ�� ��ü�� �����ϰ� �ش� ����� ����Ϸ�Ǹ� �ڿ� �ݳ��� �ڵ����� �̷������.
	 * 
	 * 
	 * */
//	try(FileReader fr=new FileReader("a_buffered.txt");BufferedReader br = new BufferedReader(fr)){
//		
//	}catch(Exception e) {
//		System.out.println("��Ҵ� ���");
//	}
	//��� ��Ʈ���� ������Ʈ�� ���������� �ϳ��� ��ġ��
	try(BufferedReader br =new BufferedReader(new FileReader("a_buffered.txt"))){
		
	}
	
	
}
}
