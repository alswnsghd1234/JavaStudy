package com.kh.assist_chap02_object.run;

import com.kh.cha04_assist_part01_buffered.model.dao.ObjectDao;

public class ObjectRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectDao od = new ObjectDao();
		
		od.saveFile("Object.txt");
	}

}
