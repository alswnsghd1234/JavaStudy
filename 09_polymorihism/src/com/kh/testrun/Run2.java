package com.kh.testrun;

import com.kh.test.Actor;
import com.kh.test.DramaActor;
import com.kh.test.MovieActor;
import com.kh.test.PlayActor;

public class Run2 {

	public static void main(String[] args) {

		//같은 배우들인데 따로 부르지말고 하나로 배우라고 부르자
		
//		Actor dActor = new Actor();
		
		Actor dActor = new DramaActor();
		
		Actor mActor = new MovieActor();
		
		Actor pActor = new PlayActor();
		
//		Actor fActor = new Fraud();
		
		
		System.out.println("드라마배우");
		dActor.action();
		dActor.cry();
		dActor.love();
		//형변환을 하는데, 연산자가 먼저 행해지기 때문에 먼저 형변환을 하기 위한 우선순위를 정해줘야한다.
		((DramaActor)dActor).mackjang();
		

		System.out.println("영화배우");
		mActor.action();
		mActor.cry();
		mActor.love();
		

		System.out.println("연극배우");
		pActor.action();
		pActor.cry();
		pActor.love();
	}

}
