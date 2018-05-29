package ch04;

public class ch04_switchExample {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; // 정수형 int을 num으로 지정  / 실수형 random을 정수형 int으로 지정
		// random 숫자 1+7까지 지정
		
		switch(num) { //switch문의 변수값을 num으로 지정하여 해당되는  값을 실행
		  case 1: // switch의 (num) 과 동일한 값이 나오는 case을 실행 시킨다.
			  System.out.println("1번이 나왔습니다.");
			  break; //다음 case 연달아서 실행하지않기 위해서 break문 사용
			  
		  case 2: // switch의 (num) 과 동일한 값이 나오는 case을 실행 시킨다.
			  System.out.println("2번이 나왔습니다.");
			  break; //다음 case 연달아서 실행하지않기 위해서 break문 사용

		  case 3: // switch의 (num) 과 동일한 값이 나오는 case을 실행 시킨다.
			  System.out.println("3번이 나왔습니다.");
			  break; //다음 case 연달아서 실행하지않기 위해서 break문 사용
			  
		  case 4: // switch의 (num) 과 동일한 값이 나오는 case을 실행 시킨다.
			  System.out.println("4번이 나왔습니다.");
			  break; //다음 case 연달아서 실행하지않기 위해서 break문 사용
			  
		  case 5: // switch의 (num) 과 동일한 값이 나오는 case을 실행 시킨다.
			  System.out.println("5번이 나왔습니다.");
			  break; //다음 case 연달아서 실행하지않기 위해서 break문 사용
			  
		  default: // 위의 case중 아무것도 해당이 안됬을때의 나머지 값인 실행 시킨다.
			  System.out.println("6번이 나왔습니다.");
			  break; //다음 case 연달아서 실행하지않기 위해서 break문 사용

		}
	}
}
