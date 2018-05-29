package ch04;

public class ch04_IfElseIfElseExample {
	//블록 수 제한이 없는 else if을 사용하여 if , else if , else중 하나가 true가 되는 조건문을 실행
	
	public static void main(String[] args) {
		int score =75; //int라는 정수형 타입의 score를 75이라는 숫자로 지정하겠다.
		
		if(score>=90) { //조건식인 if을 통해서 score가 90보다 크거나 같으면 이 if조건문을 실행하겠다.
			System.out.println("점수가  100~90보다 입니다.");
			System.out.println("등급은 A 입니다.");
			
		} else if(score>=80) { //score가 80보다 크거나 같으면 이 else if을 실행하겠다.
			//위의 if 조건문이 false가 되면 이  else if조건문을 실행
			System.out.println("점수가  80-89보다 입니다.");
			System.out.println("등급은 B 입니다.");
			
		} else if(score>=70) { //score가 70보다 크거나 같으면 이 else if을 실행하겠다.
			//위의 else if 조건문이 false가 되면 이 else if조건문을 실행
			System.out.println("점수가  70-79보다 입니다.");
			System.out.println("등급은 C 입니다.");
			
		} else //위의 else if 조건문이 false가 되면 이  이 else조건문을 실행
			//if , else if 조건문을 제외한 나머지 조건문 else
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
	}
