package java_Eui;

import java.util.Scanner;

public class ch5_11_ArrayExercise {
	
	public static void main(String[] args) {
		/*
		 * 예를 들어
		 * 2680원 이면
		 * 500원 : 5개
		 * 100원 : 1개
		 *  50원 : 1개
		 *  10원 : 3개
		 */
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("돈를 입력하세요: ");
		int money = scan.nextInt();
		int fivehundred= money/500;
		int hundred = (money%500)/100; 
		int fifty = (money%500)/50;
		int ten = (money%500)/10;
		System.out.println("");
		System.out.println("500원 : "+fivehundred+" 개 ");
		System.out.println("100원 : "+hundred+" 개");
		System.out.println("50원 : "+fifty+" 개");
		System.out.println("10원 : "+ten+" 개");
		
		scan.close();*/
		
		Scanner scan = new Scanner(System.in);
		int[] coinUnit = {500,100,50,10};
		
		System.out.println("금액을 입력해 주세요 :");
		int change=scan.nextInt();
		
		for(int i=0;i<coinUnit.length;i++) {
			int coninCount=change/coinUnit[i];
			System.out.println(coinUnit[i]+"원 동전 : "+coninCount+"개");
			
			change = change%coinUnit[i];
		}
		
		
	}

}
