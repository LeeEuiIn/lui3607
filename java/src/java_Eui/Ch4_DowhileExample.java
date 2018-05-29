package java_Eui;

import java.util.Scanner;

public class Ch4_DowhileExample {
	public static void main(String[] args) {
		// TOOD Auto-generated method stub
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료할려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") );
		
		System.out.println();
		System.out.println("프로그램을 종료");

	}

}