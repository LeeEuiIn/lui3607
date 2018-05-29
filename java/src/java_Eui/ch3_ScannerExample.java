package java_Eui;

import java.util.Scanner;

public class ch3_ScannerExample {
	
	public static void main(String[] args) {
/*
 * next() : 문자열 입력
 * nextInt() : 정수 입력
 * nextDouble() : 실수 입력
 * Close() : 스캐너 종료
 */
		//스캐너를 사용하기 위한  스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		//현재 프로그램에서 scan이라는 이름으로 Scanner 기능 사용하겠다는 의미
		System.out.println("당신의 이름을 입력해주세요 : ");
		String name= scan.next(); //.next() 문자열 입력을 위한 스캐너의 메소드
		System.out.println("당신의 이름은 " + name + "입니다.");
		scan.close();
	}

}
