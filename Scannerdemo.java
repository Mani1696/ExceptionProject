package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scannerdemo {
	public static void main (String[]args) {
		Scanner ab=new Scanner (System.in);
		System.out.println("enter the age");
		try {
		int age=ab.nextInt();
		System.out.println("your age is "+age);
		}
		catch(InputMismatchException a) {
			System.out.println(a);
		}
	}

}
