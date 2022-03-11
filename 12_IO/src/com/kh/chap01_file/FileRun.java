package com.kh.chap01_file;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args){
		
		//�����ϰ� ������ ����� ����
		//File Ŭ������ ������ �۾�
		//java.io ��Ű��
		
		//���� Ŭ�������� ��ü ����
		File file1 = new File("test.txt");//File��ü ���� ������ ����������� �ʰ� ���ϸ� ��� �����ϸ�
										  //���� ������Ʈ ������ ������
		
			try {
				file1.createNewFile();
			
		//2.��������� �� ���ϸ��� �����ؼ� ���� ->���� �����ϴ� ��θ� �����ؾ��� \\�ΰ� �Է��ؾ� \�� �ν���
			File file2 = new File("D:\\moon\\test.txt");
				file2.createNewFile();
		//3.������ �����ϰ��� �� �ȿ� ������ ����
			File testFolder = new File("D:\\test");
			testFolder.mkdir(); //make directory
			
			File file3 = new File("D:\\test\\hi.txt");
			file3.createNewFile();
			
		//4.������ ����������� ���� ������ ���ϻ��� ->���� �� ������Ʈ�� ������ �����ȴ�.
			File testFolder2 = new File("hoo");
			testFolder2.mkdir();
			
			File file4 = new File("hoo\\hoho.txt");
			file4.createNewFile();
			
			//File Ŭ�������� �����ϴ� �޼ҵ��
			
			System.out.println("file1�� �����ΰ��� ? "+file1.isFile());//�����̸� true/������ false�� ��ȯ
			System.out.println("testFolder2�� �����ΰ��� ? "+testFolder2.isFile());//�����ϱ� false
			
			System.out.println("�����̸� : "+file1.getName()); //���ϸ� �����ؼ� ��ȯ
			System.out.println("�������� : "+file1.getParent()); //���� ������ �����ؼ� ��ȯ
			System.out.println("���Ͽ뷮 : "+file1.length());//���� ũ�� ��ȯ
			System.out.println("������ : "+file1.getAbsolutePath());//�������������� Ǯ���.
			
			} 
			
			catch (IOException e) {
				e.printStackTrace();
			}
	}

}
