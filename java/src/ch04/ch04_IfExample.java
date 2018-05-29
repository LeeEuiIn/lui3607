package ch04;

public class ch04_IfExample {

	public static void main(String[] args) {
		int score =93; //int라는 정수형 타입의 score를 93이라는 숫자로 지정하겠다.
		
		if(score>=90) { //조건식인 if을 통해서 score가 90보다 크거나 같으면 이 if조건문을 실행하겠다.
			System.out.println("점수가  90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score<90) {//조건식인 if을 통해서 score가 90보다 작으면  이 if조건문을 실행하겠다.
			System.out.println("점수가  90보다 작습니다..");
			System.out.println("등급은 B 입니다.");
		}
	}
}
