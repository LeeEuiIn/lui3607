package ch04;

public class ch04_IfElseExample {
	
	public static void main(String[] args) {
		int score = 85; //int라는 정수형 타입의 score를 85이라는 숫자로 지정하겠다.
		
		if(score>=90) { //조건식인 if을 통해서 score가 90보다 크거나 같으면 이 if조건문을 실행하겠다.
			System.out.println("점수가  90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
			
		} else { // 위의 if 조건문이 false가 되면 else 조건문을 실행
			//if 조건문을 제외한 나머지 조건문 else
			System.out.println("점수가  90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
			
		}
	}

}
