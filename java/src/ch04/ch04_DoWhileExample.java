package ch04;

import java.util.Scanner; //Scanner 클래스를 사용하기위한 코드

public class ch04_DoWhileExample {
	//do-while은 
	
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
	Scanner scanner = new Scanner(System.in); //Scaner의 객체 생성
	String inputString; //String의 문자열을 inputString으로 지정

	do {
		System.out.print(">");
		inputString = scanner.nextLine(); //키보드로 입력한 문자열을 저장
		System.out.println(inputString);
	} while ( ! inputString.equals("q") );
	
	System.out.println();
	System.out.println("프로그램 종료");
}
} 