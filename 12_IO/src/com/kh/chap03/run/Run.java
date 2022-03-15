package com.kh.chap03.run;

import com.kh.cha04_assist_part01_buffered.model.dao.ObjectDao;
import com.kh.chap03.model.dao.FileCharDao;

public class Run {

	public static void main(String[] args) {

		FileCharDao fcd = new FileCharDao();
		
//		fcd.fileSave();
		fcd.fileRead();
		
		ObjectDao o = new ObjectDao();
		
		o.saveFile("Object.txt");
		o.readFile("Object.txt");
	}

}
