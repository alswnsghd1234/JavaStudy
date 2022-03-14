package com.kh.cha04_assist_part01_buffered.Run;

import com.kh.cha04_assist_part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
	BufferedDao bd = new BufferedDao();
	
//	bd.fileSave();
	bd.fileRead();
	}
}
