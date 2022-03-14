package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO (Data Access Object) : �����Ͱ� �����Ǿ��ִ� ������ ���� �����ؼ� �����͸� ������ϴ� �޼ҵ���� 
//							 ��Ƶ� Ŭ���� model.dao ��Ű���� ��Ƽ� ��� 
public class FileByteDao {
	
	//����Ʈ ��Ʈ�� �ǽ�
	
	//���α׷� ->�ܺ�(����)
	//��� : ���α׷� ���� �����͸� ���Ϸ� �������� (��,���Ϸ� ����ϰڴ�) 
	
	//FileOutputStream : "����"�� ����ϴµ� 1byte ������ �ϰڴ�.
	public void method1() {
		
//		1.FileOutputStream ��ü ����
//		�ش� ���ϰ� ���� �����ϴ� ��θ� ����
//		�ش� ������ �������� ������ ������ �����ϸ鼭 ����ȴ�.
//		�ش������� �����ϴ°�� : �׳� ��θ� ����
		FileOutputStream fout=null;
		//try���ȿ��� ����� finally���� ���Ұ� (��������)
		
		try {
			fout=new FileOutputStream("a_byte.txt",true);
			//true �ۼ��� : ������ ������ ������ �̾ �ۼ��� 
			//false �ۼ��� : ������ ������ ���� ��� �������(false�� �⺻�ɼ�)
			
			
//		2.������ ��η� �����͸� ����
//		write() �޼ҵ�� �ۼ�
//		1byte ������ ���ڸ� ��� ���� (���� �Ұ�)
//		�� ���Ͽ� ��ϵǱ⸦ �ش� ������ ������ ���ڰ� ��ϵ�(�ƽ�Ű�ڵ�)
//		0~127
//		������ ���
		fout.write(81);
		fout.write(66);
		fout.write(100);
		
		byte[] arr= {97,112,112,108,101}; //apple ���ͳݿ� �ƽ�Ű�ڵ�ǥ �˻��� �ش��ϴ� ���� �ֱ�.
		
		
		fout.write(arr);
		
		fout.write(arr,1,3); //arr�迭�κ��� 1���ε������� 3���� ����
		
		fout.write('A');
		fout.write('b');
		//�ѱ��� 2byte�̱⶧���� ������ �Էµ�. ����Ʈ��Ʈ�����δ� �Ұ� -> ���ڽ�Ʈ�� ���.
		fout.write('��');
		fout.write('��');
		
		//3.��Ʈ���� �� ���� �ڿ��� �ݳ��ؾ��Ѵ� �ݵ��
//		fout.close(); �߰��� ���ܹ߻��� �ڿ��ݳ��� �ȵȴ�.
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//� ���ܰ� �߻��ϴ��� ����Ǵ� ���� 
				 //�ݵ�� ���� �ؾ��ϴ� ������ �����ش� 
			
			try {
				fout.close(); //����ó�� �������
				//�ڿ��ݳ� (��� �ݱ�)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	//����->���α׷�
	//�Է� �޾ƿ��� (���Ϸκ��� �����͸� ������ ��)
	
	public void method2() {
		
		//FileInputStream : ���Ϸκ��� �����͸� �Է¹޴µ� 1byte�� �������ڴ�.
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("a_byte.txt");//�ݵ�� �����ϴ� ���Ϸ� ���������
			
			//read() �޼ҵ�� ������ �о����
			//1byte�� �о�´�
			
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			//������ ���� ������ ���� read()�޼ҵ带 ȣ���ϸ� -1�� ��ȯ�Ѵ�.
//			int value =0;
//			while((value=fis.read())!=-1) { //fis.read()�� �ϴ� ���� ���� �������� ������ ������ ����� 
//				System.out.println(value);  //����������� ������ ��Ƽ� ����ϱ� 
//			}
//			fis.read(); //int���� ��ȯ�� �ϰ� �� 
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
		
		//��ü�� �����Ѵ�. FileOutStream �� �̿��Ͽ� ���� ���� ��ü ����
		//FileOutStream �� �ܺη� �������ڴ� byte ũ���
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("About.txt",true); // txt���� ����
			//true �ۼ��� ���� ���Ͽ� �̾ �ۼ�
			//false �ۼ� ��  ���� ���Ͽ� �����
			
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
			}// �� ����� �ݱ� �ʼ�
			catch(IOException e){
				e.printStackTrace();
			} //������ �������� ã��
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
