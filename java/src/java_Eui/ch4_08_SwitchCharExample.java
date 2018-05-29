package java_Eui;

import java.util.Scanner;

public class ch4_08_SwitchCharExample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 성적을 입력해주세요 : ");
		int score = scan.nextInt();
		
		System.out.print("학년을 입력하세요 : ");
		int year = scan.nextInt();
		
		if(score>=60) {
			if(year !=4)
				System.out.println("합격입니다.");//60점 이상이고 4학년이 아닌경우
			else if(score >=70)
				System.out.println("합격입니다.");//4학년이고 70점 이상인경우
			else
				System.out.println("불합격입니다.");//4학년이고 70점 미만인경우
		} else
			System.out.println("불합격입니다.");//60점 미만인경우
	}
}
