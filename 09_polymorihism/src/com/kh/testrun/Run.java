package com.kh.testrun;

import com.kh.test.DramaActor;
import com.kh.test.MovieActor;
import com.kh.test.PlayActor;

public class Run {

	public static void main(String[] args) {

		PlayActor p = new PlayActor();
		DramaActor d = new DramaActor();
		MovieActor m = new MovieActor();
		
		System.out.println("===���ع���� �ɷ�===");
		p.action();
		p.cry();
		p.love();
		p.goodVoice();
		
		System.out.println("===��󸶹���� �ɷ�===");
		d.action();
		d.cry();
		d.love();
		d.mackjang();
		
		System.out.println("==��ȭ����� �ɷ�==");
		m.action();
		m.cry();
		m.love();
		m.cgAct();
	}

}
