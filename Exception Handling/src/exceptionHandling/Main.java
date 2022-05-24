package exceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		System.out.printf("Input age : ");
		Scanner key = new Scanner(System.in);
		
		try {
			int age = key.nextInt();	// 정수가 아닌 수를 입력했을 떄 throw 함.
			if (age < 0) throw new InputMismatchException();	// negative입력시 throw 함.
			System.out.println("Your age is " + age);		 	// argument에 string 입력 가능. 
			
		} catch(InputMismatchException e) {
			System.out.println("Please input positive integer.");
		} /*
		catch(Exception e) {		구체적인 exception부터 catch해야 함.
			System.out.println(e.getMessage());			argument에 해당하는 것을 return
		}*/
	}

}
