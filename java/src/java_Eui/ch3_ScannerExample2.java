package java_Eui;

import java.util.Scanner;

public class ch3_ScannerExample2 {
	
	public static void main(String[] args) {
/*
 * next() : 문자열 입력
 * nextInt() : 정수 입력
 * nextDouble() : 실수 입력
 * Close() : 스캐너 종료
 */
		System.out.println("이름, 도시, 나이, 체중을 빈칸으로 분리하여 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		//현재 프로그램에서 scan이라는 이름으로 Scanner 기능 사용하겠다는 의미
		

		String name= scan.next();
		System.out.println("당신의 이름은" + name + "입니다.");
		
		String city= scan.next();
		System.out.println("당신이 사는도시는" + city + "입니다.");
		
		int age= scan.nextInt(); // 정수 입력으로 int 을 입력
		System.out.println("당신의 나이는" + age  + "살입니다.");
		
		Double weight= scan.nextDouble(); // 실수 입력을 위한 double 입
		System.out.println("당신의 체중은" + weight  + "kg입니다.");
		scan.close();
	}

}