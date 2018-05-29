package java_Eui;

import java.util.Scanner;

public class ch5_09_ArrayExercise {
	
	public static void main(String[] args) {
		/*
		 * 문제
		 * 양수 5개를 입력 받아서 배열에 저장하고,
		 * 입력 받을 수 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
		 */
		/*Scanner scan = new Scanner(System.in);
		
		int[] num=new int[5];
		int sum=0 , max=0;
		System.out.println("양수 5개를 입력하세요. : ");
		for(int i=0;i<num.length;i++) {
			num[i]=scan.nextInt();
			System.out.print(num[i]);
			System.out.print(" ");
			
			if(max==num);
			}
		    System.out.println(" ");
			System.out.println("가장 큰 수는"+max+"입니다.");*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		//수를 입력받을 배열 변수 선언.
		int[] intArray = new int[5];
		//최대값 을 담을 변수 선언.
		int max=0;
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = scanner.nextInt();
			//배열의 요소를 하나하나 비교하면서 최대값을 저장함.
			if(intArray[i]>max)
				max=intArray[i];
		}
		System.out.println("가장 큰 수는"+max+"입니다.");
		
	}
}
