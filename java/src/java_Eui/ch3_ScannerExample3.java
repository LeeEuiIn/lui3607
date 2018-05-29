package java_Eui;

import java.util.Scanner;

public class ch3_ScannerExample3 {
	public static void main(String[] args) {
/*
 * next() : 문자열 입력
 * nextInt() : 정수 입력
 * nextDouble() : 실수 입력
 * Close() : 스캐너 종료
 */
		
		Scanner scan = new Scanner(System.in);
		//현재 프로그램에서 scan이라는 이름으로 Scanner 기능 사용하겠다는 의미
		System.out.println("초를 입력하세요: ");
		int time = scan.nextInt();
		int hour = time/3600;//몫이 시간값
		int minute = (time%3600)/60; 
		int second = (time%3600)%60;
		System.out.println("초는" +hour+"시간"+minute+"분"+second+"초"+"입니다.");
		scan.close();
}
}

