package java_Eui;

import java.util.Scanner;

public class ch4_22_Example {
	
	public static void main(String[] args) {
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		int score =0;
		Scanner scan = new Scanner(System.in);
		int j;
		
		
		do {
			System.out.println("-----------------------------------");
			System.out.println(" 1.예금 | 2.출금  | 3.잔고  | 4.종료: ");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			j = scan.nextInt();
			if(j==1){
				
				System.out.print("예금액>");
				A=scan.nextInt();
				C+=A;
				System.out.println("잔고>현재 잔액은 "+C+"입니다.");
			}
							
	}while(true);
}
}