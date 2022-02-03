
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class whileTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		input = scanner.nextInt();
		
		do {
			input = scanner.nextInt();
			sum += input;

		} while( input != 0);
		System.out.println(sum);
	}



}
