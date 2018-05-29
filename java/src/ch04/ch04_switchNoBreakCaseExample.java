package ch04;

public class ch04_switchNoBreakCaseExample {
	//break가 없는 switch문
	public static void main(String[] args) {
		int time =(int)(Math.random()*4) + 8; // 정수형 int을 time으로지정 / 범위가 8~12까지의 숫자 지정 실수 random을 정수형 int로 지정
		System.out.println("[현재시간: " + time + " 시");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			
		case 9:
			System.out.println("회의를 합니다.");
			
		case 10:
			System.out.println("업무를 봅니다.");
			
		default:
			System.out.println("외근을 나갑니다.");
			
			//랜덤으로 지정된 숫자에서 해당되는 case의 변수부터 차례대로 연속으로 case을 실행한다.
			
	
		}
	}

}
