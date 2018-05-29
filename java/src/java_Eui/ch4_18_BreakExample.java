package java_Eui;

import java.util.Scanner;

public class ch4_18_BreakExample {
	
	public static void main(String[] args) {
		// TOOD Auto-generated method sthb
		/*
		 * 1부터 입력받은 수까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 계산하시오.
		 */
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.println("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		for(int i=1; i<num; i++) {
			//2의배수로 판단 : num%2==0
			//3의배수로 판단 : num%3==0
			if(num%2 !=0 && num%3 !=0 ) {
				sum = sum + num;
			}
		}
		System.out.println("합계 : " + sum);
	}
}
