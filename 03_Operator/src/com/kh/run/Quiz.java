package com.kh.run;

public class Quiz {

	public static void main(String[] args) {

		
		int a = 5; //7
		int b = 10; //9
		int c = (++a) + b; // 
		int d = c / a; // -1
		int e = c % a; // -2
		int f = e++; // -1
		int g = (--b) + (d--); //7
		int h = 2;
		int i = a++ + b/ (- -c/f)*(g-- - d)%(++e +h); 
				
		
		System.out.println(a); // 7
		System.out.println(b); // 9
		System.out.println(c); // 16
		System.out.println(d); // 
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}

}
