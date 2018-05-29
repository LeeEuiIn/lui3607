package java_Eui;

import java.util.Scanner;

public class ch3_ScannerExample4 {

	public static void main(String[] args) {
/*
 * next() : 문자열 입력
 * nextInt() : 정수 입력
 * nextDouble() : 실수 입력
 * Close() : 스캐너 종료
 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력하세요 : ");
		double radius = scan.nextDouble();
		double areawithPi = radius*radius*Math.PI;
		double area = radius*radius*3.14;
		System.out.println("원의 면적은" + area + "입니다");
		System.out.println("pi를 이용한 원의 면적은" + areawithPi );
		System.out.println(Math.PI);
		scan.close();
	
	}
}
