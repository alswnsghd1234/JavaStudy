package com.kh.chap02_byte.model.duo;

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
		FileOutputStream fout = null ;
		try {
			fout=new FileOutputStream("a_byte.txt");
			
//		2.������ ��η� �����͸� ����
//		write() �޼ҵ�� �ۼ�
//		1byte ������ ���ڸ� ��� ���� (���� �Ұ�)
//		�� ���Ͽ� ��ϵǱ⸦ �ش� ������ ������ ���ڰ� ��ϵ�(�ƽ�Ű�ڵ�)
//		0~127
//		������ ���
		fout.write(65);
		fout.write(66);
		fout.write(100);
		
		byte[] arr = {97,112,112,108,101}; // apple 
		
		fout.write(arr);
		fout.write(arr,1,3);
		// �ѱ��� 2btye �̱� ������ ������ �Էµ�. ����Ʈ��Ʈ�����δ� �Ұ� -> ���� ��Ʈ�� ���
		fout.write('��');
		fout.write('��');
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		finally {//� ���ܰ� �߻��ϴ��� ����Ǵ� ����
			//�ݵ�� ���� �ؾ��ϴ±����� �����ش�
			try {
				fout.close();
				//�ڿ��ݳ�/��δݱ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	

}
