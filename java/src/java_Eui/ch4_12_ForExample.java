package java_Eui;

import java.util.Scanner;

public class ch4_12_ForExample {
	
	public static void main(String[] args) {
		//출력 형태
		//1+2+3+4+5+6+7+8+9+10=55
		
		int i, sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 숫자 입력 : ");
		int score = scan.nextInt();
		int sco = scan.nextInt();
		
		for(i=1; i<=score; i++) { // 1~10까지 반복	
		sum += i;
		System.out.print(i); // 더하는 수 출력
		
		if(i<score) // 1~9까지는 '+' 출력
			System.out.print("+");
		else  { // i가 10인 경우
			System.out.print("="); // '=' 출력하고
			System.out.print(sum); // 덧셈 결과 출력
		}
	}
}
}