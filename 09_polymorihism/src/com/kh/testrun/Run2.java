package com.kh.testrun;

import com.kh.test.Actor;
import com.kh.test.DramaActor;
import com.kh.test.MovieActor;
import com.kh.test.PlayActor;

public class Run2 {

	public static void main(String[] args) {

		//���� �����ε� ���� �θ������� �ϳ��� ����� �θ���
		
//		Actor dActor = new Actor();
		
		Actor dActor = new DramaActor();
		
		Actor mActor = new MovieActor();
		
		Actor pActor = new PlayActor();
		
//		Actor fActor = new Fraud();
		
		
		System.out.println("��󸶹��");
		dActor.action();
		dActor.cry();
		dActor.love();
		//����ȯ�� �ϴµ�, �����ڰ� ���� �������� ������ ���� ����ȯ�� �ϱ� ���� �켱������ ��������Ѵ�.
		((DramaActor)dActor).mackjang();
		

		System.out.println("��ȭ���");
		mActor.action();
		mActor.cry();
		mActor.love();
		

		System.out.println("���ع��");
		pActor.action();
		pActor.cry();
		pActor.love();
	}

}
