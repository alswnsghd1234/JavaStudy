package com.kh.chap01_oneVsmany.run;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {

		Book b = new Book("나","혼자","산다");
		b.showInfo();
	}

}
